package recipes.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import recipes.model.Recipe;
import recipes.service.RecipeService;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/recipe")
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping("/new")
    public Map<String, Long> addRecipe(@Valid @RequestBody Recipe recipe) {
        recipe.setDate(LocalDateTime.now());
        Recipe savedRecipe = recipeService.save(recipe);
        return Collections.singletonMap("id", savedRecipe.getId());
    }

    @GetMapping("/{id}")
    public Recipe getRecipe(@PathVariable long id) {
        Recipe recipe = recipeService.findRecipeById(id);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return recipe;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRecipe(@PathVariable long id) {
        Recipe recipe = recipeService.findRecipeById(id);
        if (recipe == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        recipeService.deleteRecipeById(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateRecipe(@PathVariable long id, @Valid @RequestBody Recipe recipe) {
        Recipe recipeFromDb = recipeService.findRecipeById(id);
        if (recipeFromDb == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        recipe.setId(id);
        recipe.setDate(LocalDateTime.now());
        recipeService.save(recipe);
    }

    @GetMapping("/search")
    public List<Recipe> searchRecipe(@RequestParam(required = false) String category, @RequestParam(required = false) String name) {
        if (category != null && !category.isBlank()) {
            return recipeService.getSortedRecipeByCategory(category);
        }
        return recipeService.getSortedRecipeByName(name);
    }

}


