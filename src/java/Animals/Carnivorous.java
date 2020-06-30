package Animals;

import Food.*;

/**
 * Класс хищник.
 */
public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " ест: " + food);
        } else {
            System.out.println(name + " не ест такую еду");
        }
    }
}
