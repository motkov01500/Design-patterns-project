package org.burger.project.factory;

import org.burger.project.entity.Burger;
import org.burger.project.decorator.BurgerGarlicSauceDecorator;
import org.burger.project.decorator.BurgerKetchupSauceDecorator;
import org.burger.project.decorator.ClassicBurger;

public class BurgerFactory {

    private static Burger burger;

    public static Burger createBurger(String burgerType) {
        if (burgerType.equals("classic")) {
            return new ClassicBurger();
        } else if (burgerType.equals("garlic")) {
            return new BurgerGarlicSauceDecorator(burger);
        } else if (burgerType.equals("ketchup")) {
            return new BurgerKetchupSauceDecorator(burger);
        } else {
            throw new IllegalArgumentException("Invalid burger type");
        }
    }
}
