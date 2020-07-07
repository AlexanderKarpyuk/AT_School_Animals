package ru.lanit.zoo.animals;

import ru.lanit.zoo.exceptions.WrongFoodException;
import ru.lanit.zoo.food.Food;

/**
 * Класс хищник.
 */
public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (!food.isVegetable()) {
            System.out.println(name + " ест: " + food);
        } else {
            throw new WrongFoodException(name + " не ест такую еду");
        }
    }
}
