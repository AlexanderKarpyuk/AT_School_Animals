package Animals;

import Food.*;

public class Zebra extends Herbivore {
    private static int count;
    private String name;

    public Zebra() {
        count++;
        name = "Зебра №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            System.out.println(name + " ест " + food.getName());
        } else {
            System.out.println(name + " не ест такую еду");
        }
    }


}
