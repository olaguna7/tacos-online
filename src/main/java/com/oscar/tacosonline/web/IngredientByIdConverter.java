package com.oscar.tacosonline.web;

import com.oscar.tacosonline.data.IngredientRepository;
import com.oscar.tacosonline.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Component
public class IngredientByIdConverter  implements Converter<String, Ingredient> {

    @Autowired
    IngredientRepository ingredientRepository;

    @Override
    public Ingredient convert(String source) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(source);
        return ingredient.isPresent()? ingredient.get() : null;
    }
}
