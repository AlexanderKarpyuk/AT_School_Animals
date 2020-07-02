package Animals;

import Exceptions.WrongFoodException;
import Food.Food;

/**
 * Супер класс животное.
 */
public abstract class Animal {
    protected String name;

    public abstract void eat(Food food) throws WrongFoodException;

    public abstract String getName();

    @Override
    public String toString() {
        return name;
    }
}
