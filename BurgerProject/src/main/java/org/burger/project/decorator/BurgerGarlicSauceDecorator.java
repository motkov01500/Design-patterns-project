package org.burger.project.decorator;

import org.burger.project.entity.Burger;

import java.util.List;

public class BurgerGarlicSauceDecorator extends BurgerDecorator{

    public BurgerGarlicSauceDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("garlic sauce");
        return ingredients;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        price += 1.20;
        return price;
    }
}
