package com.oscar.tacosonline.data;

import com.oscar.tacosonline.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);
}