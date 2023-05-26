package org.burger.project.decorator;

import org.burger.project.entity.Burger;

import java.util.List;

public abstract class BurgerDecorator implements Burger
{
    Burger decoratedBurger;

    public BurgerDecorator(Burger decoratedBurger) {
        this.decoratedBurger = decoratedBurger;
    }

    @Override
    public List<String> getIngredients() {
        return decoratedBurger.getIngredients();
    }

    @Override
    public double getPrice() {
        return decoratedBurger.getPrice();
    }
}
