package Animals;

import Exceptions.WrongFoodException;
import Food.*;

/**
 * Класс хищник.
 */
public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            System.out.println(name + " ест: " + food);
        } else {
            throw new WrongFoodException(name + " не ест такую еду");
        }
    }
}
