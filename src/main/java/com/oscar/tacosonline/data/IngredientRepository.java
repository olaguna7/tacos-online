package com.oscar.tacosonline.data;

import com.oscar.tacosonline.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}