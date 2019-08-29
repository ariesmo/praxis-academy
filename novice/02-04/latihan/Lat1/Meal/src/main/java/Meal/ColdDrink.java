package Meal;

import Meal.Bottle;
import Meal.Item;
import Meal.Packing;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}