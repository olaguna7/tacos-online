package com.oscar.tacosonline.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {
    private Long id;
    private Date createdAt;
    @NotNull
    @Size(min = 5, message = "El nombre del taquito tiene que tener como mínimo 5 caracteres")
    private String name;
    private List<Ingredient> ingredients;
}
