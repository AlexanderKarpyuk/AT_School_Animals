package Animals;

import Exceptions.WrongFoodException;
import Food.*;

/**
 * Класс травоядное.
 */
public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Vegetable) {
            System.out.println(name + " ест: " + food);
        } else {
            throw new WrongFoodException(name + " не ест такую еду");
        }
    }
}
