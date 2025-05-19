package com.oscar.tacosonline.model;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {
    @NotBlank(message = "El nombre del taquito es obligatorio")
    private String name;
    @NotBlank(message = "El nombre de la calle es obligatoria")
    private String street;
    @NotBlank(message = "El nombre de la ciudad es obligatoria")
    private String city;
    @NotBlank(message = "El nombre del estado es obligatorio")
    private String state;
    @NotBlank(message = "El nombre del zip es obligatorio")
    private String zip;
    @CreditCardNumber(message = "No te hagás el vivo, que esta tarjeta es falsa")
    private String ccNumber;
    @Pattern(regexp = "^(0[1-9]|1[0-2])(\\/)([2-9][0-9])", message = "La fecha debe ser MM/AA")
    private String ccExpiration;
    @Digits(integer = 3, fraction = 0, message = "CVV inválido")
    private String ccCVV;
}
