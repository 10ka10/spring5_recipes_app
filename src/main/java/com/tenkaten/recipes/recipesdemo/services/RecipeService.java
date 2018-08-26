package com.tenkaten.recipes.recipesdemo.services;

import com.tenkaten.recipes.recipesdemo.model.Recipe;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
