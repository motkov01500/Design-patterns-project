package org.burger.project;

import org.burger.project.command.BurgerChef;
import org.burger.project.command.Cashier;
import org.burger.project.entity.Burger;
import org.burger.project.decorator.BurgerGarlicSauceDecorator;
import org.burger.project.decorator.BurgerKetchupSauceDecorator;
import org.burger.project.singleton.Restaurant;
import org.burger.project.factory.BurgerFactory;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Restaurant restaurant = Restaurant.getInstance();

        //Command
        BurgerChef chef = new BurgerChef();
        Cashier cashier = new Cashier(chef);
        cashier.takeOrder("classic");

        //Factory
        BurgerFactory burgerFactory;
        Burger burger = BurgerFactory.createBurger(cashier.getOrder());

        //Decorator
        burger = new BurgerKetchupSauceDecorator(burger);
        burger = new BurgerGarlicSauceDecorator(burger);

        System.out.println(burger.getIngredients());
    }
}