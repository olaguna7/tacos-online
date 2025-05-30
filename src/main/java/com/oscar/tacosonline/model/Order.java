package com.oscar.tacosonline.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "Taco_Order_Tacos")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date placedAt;
    @NotBlank(message = "El nombre del taquito es obligatorio")
    private String deliveryName;
    @NotBlank(message = "El nombre de la calle es obligatoria")
    private String deliveryStreet;
    @NotBlank(message = "El nombre de la ciudad es obligatoria")
    private String deliveryCity;
    @NotBlank(message = "El nombre del estado es obligatorio")
    private String deliveryState;
    @NotBlank(message = "El nombre del zip es obligatorio")
    private String deliveryZip;
    @CreditCardNumber(message = "No te hagás el vivo, que esta tarjeta es falsa")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])(\\/)([2-9][0-9])", message = "La fecha debe ser MM/AA")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "CVV inválido")
    private String ccCVV;

    @ManyToMany(targetEntity = Taco.class)
    private List<Taco> tacos = new ArrayList<>();

    public void addDesign(Taco design) {
        tacos.add(design);
    }

    @PrePersist
    public void placedAt() {
        this.placedAt = new Date();
    }
}
