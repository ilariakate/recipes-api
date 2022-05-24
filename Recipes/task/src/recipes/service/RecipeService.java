package recipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import recipes.model.Recipe;
import recipes.repository.RecipeRepository;

import java.util.Collections;
import java.util.List;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public Recipe getById(Long id) {
        var foundRecipe = recipeRepository.findById(id);
        if (foundRecipe.isPresent()) {
            return foundRecipe.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteRecipeById(long id) {
        var foundRecipe = recipeRepository.findById(id);
        if (foundRecipe.isPresent())
            recipeRepository.delete(foundRecipe.get());
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public void updateById(Long id, Recipe recipe) {
        var foundRecipe = recipeRepository.findById(id);
        if (foundRecipe.isPresent()) {
            recipe.setId(id);
            recipeRepository.save(recipe);
        }
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public List<Recipe> getAllByCategory(String category) {
        var foundRecipes =
                recipeRepository.findAllByCategoryIgnoreCaseOrderByDateDesc(category);
        return foundRecipes.orElse(Collections.emptyList());
    }

    public List<Recipe> getAllByNameContaining(String name) {
        var foundRecipes =
                recipeRepository.findAllByNameContainingIgnoreCaseOrderByDateDesc(name);
        return foundRecipes.orElse(Collections.emptyList());
    }
}
