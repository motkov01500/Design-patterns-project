package org.burger.project.command;

import org.burger.project.entity.Burger;
import org.burger.project.factory.BurgerFactory;

public class BurgerChef {

    public void prepareBurger(String burgerType) {
        Burger burger = BurgerFactory.createBurger(burgerType);
        if(burgerType.equals("garlic")) {
            burger.getIngredients().add("garlic sauce");
        } else if (burgerType.equals("ketchup sauce")) {
            burger.getIngredients().add("Ketchup");
        }
        System.out.println("Burger in progress....");
    }
}
