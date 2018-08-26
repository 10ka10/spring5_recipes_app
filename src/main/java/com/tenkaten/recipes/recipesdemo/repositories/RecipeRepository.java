package com.tenkaten.recipes.recipesdemo.repositories;

import com.tenkaten.recipes.recipesdemo.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
