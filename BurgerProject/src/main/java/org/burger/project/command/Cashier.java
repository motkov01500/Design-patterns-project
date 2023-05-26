package org.burger.project.command;

public class Cashier {

    private String order;
    BurgerChef burgerChef;

    public Cashier(BurgerChef burgerChef) {
        this.burgerChef = burgerChef;
    }

    public void takeOrder(String burgerType) {
        order = burgerType;
        burgerChef.prepareBurger(order);
    }

    public String getOrder() {
        return order;
    }
}
