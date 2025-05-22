package com.oscar.tacosonline.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
