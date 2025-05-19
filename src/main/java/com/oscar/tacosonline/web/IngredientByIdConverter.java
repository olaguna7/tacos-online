package com.oscar.tacosonline.web;

import com.oscar.tacosonline.data.JdbcIngredientRepository;
import com.oscar.tacosonline.model.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;

@Controller
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    @Autowired
    private JdbcIngredientRepository ingredientRepository;

    @Override
    public Ingredient convert(String source) {
        return ingredientRepository.findOne(source);
    }
}
