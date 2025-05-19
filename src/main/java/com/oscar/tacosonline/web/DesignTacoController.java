package com.oscar.tacosonline.web;

import com.oscar.tacosonline.model.Ingredient;
import com.oscar.tacosonline.model.Ingredient.Type;
import com.oscar.tacosonline.model.Order;
import com.oscar.tacosonline.model.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model) {
        fillIngredients(model);
        // model.addAttribute("tktn", new Taco());
        return "design";
    }

    @ModelAttribute(name = "tktn")
    public Taco taco() {
        log.info("Iniciando taco");
        return new Taco();
    }

    @ModelAttribute
    public Order order() {
        log.info("Iniciando orden");
        return new Order();
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(ingredient -> ingredient.getType() == type).collect(Collectors.toList());
    }

    @PostMapping
    public String processDesign(@Valid @ModelAttribute(name="tktn") Taco design, Errors errors, Model model, @ModelAttribute Order order) {
        if (errors.hasErrors()) {
            fillIngredients(model);
            return "design";
        }
        log.info("Processing Design Taco: " + design);
        order.addDesign(design);
        return "redirect:/orders/current";
    }

    public void fillIngredients(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "Flour Tortilla", Type.WRAP),
                new Ingredient("COTO", "Corn Tortilla", Type.WRAP),
                new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
                new Ingredient("CARN", "Carnitas", Type.PROTEIN),
                new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
                new Ingredient("LETC", "Lettuce", Type.VEGGIES),
                new Ingredient("CHED", "Cheddar", Type.CHEESE),
                new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
                new Ingredient("SLSA", "Salsa", Type.SAUCE),
                new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
        );

        Ingredient.Type[] types = Ingredient.Type.values();

        for(Ingredient.Type type : types){
            model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
        }
    }
}
