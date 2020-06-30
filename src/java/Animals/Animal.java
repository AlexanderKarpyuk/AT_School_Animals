package Animals;

import Food.Food;

/**
 * Супер класс животное.
 */
public abstract class Animal {
    protected static int count;
    protected String name;

    public abstract void eat(Food food);

    public abstract String getName();

    @Override
    public String toString() {
        return name;
    }
}
