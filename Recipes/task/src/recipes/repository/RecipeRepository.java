package recipes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import recipes.model.Recipe;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Optional<List<Recipe>> findAllByCategoryIgnoreCaseOrderByDateDesc(String category);
    Optional<List<Recipe>> findAllByNameContainingIgnoreCaseOrderByDateDesc(String name);
    Optional<Recipe> findById(long id);

}
