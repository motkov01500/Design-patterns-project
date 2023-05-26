package org.burger.project.singleton;

public class Restaurant {

    private static Restaurant restaurant = null;

    private Restaurant() {
    }

    public static Restaurant getInstance() {
        if (restaurant == null) {
            restaurant = new Restaurant();
        }
        return restaurant;
    }
}
