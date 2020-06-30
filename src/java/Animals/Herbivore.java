package Animals;

import Food.*;

/**
 * Класс травоядное.
 */
public abstract class Herbivore extends Animal {
    private String name;

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " ест " + food);
        } else {
            System.out.println(name + " не ест такую еду");
        }
    }
}
