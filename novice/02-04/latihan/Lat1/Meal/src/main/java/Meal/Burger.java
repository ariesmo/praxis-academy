package Meal;

import Meal.Item;
import Meal.Packing;
import Meal.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}