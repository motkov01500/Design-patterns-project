package org.burger.project.decorator;

import org.burger.project.entity.Burger;

import java.util.ArrayList;
import java.util.List;

public class ClassicBurger implements Burger {

    private List<String> ingredients;

    public ClassicBurger() {
        this.ingredients = new ArrayList<>();
    }

    @Override
    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public double getPrice() {
        return 4.50;
    }
}
