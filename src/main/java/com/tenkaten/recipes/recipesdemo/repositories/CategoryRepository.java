package com.tenkaten.recipes.recipesdemo.repositories;

import com.tenkaten.recipes.recipesdemo.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
