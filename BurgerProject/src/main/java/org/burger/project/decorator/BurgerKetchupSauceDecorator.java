package org.burger.project.decorator;

import org.burger.project.entity.Burger;

import java.util.List;

public class BurgerKetchupSauceDecorator extends BurgerDecorator{

    public BurgerKetchupSauceDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    @Override
    public List<String> getIngredients() {
        List<String> ingredients = super.getIngredients();
        ingredients.add("ketchup");
        return ingredients;
    }

    @Override
    public double getPrice() {
        double price = super.getPrice();
        price += 1.20;
        return price;
    }
}
