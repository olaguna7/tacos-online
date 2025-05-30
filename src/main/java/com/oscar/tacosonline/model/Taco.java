package com.oscar.tacosonline.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    @NotNull
    @Size(min = 5, message = "El nombre del taquito tiene que tener como mínimo 5 caracteres")
    private String name;

    @ManyToMany(targetEntity = Ingredient.class)
    private List<Ingredient> ingredients;

    @PrePersist
    public void createdAt() {
        this.createdAt = new Date();
    }
}
