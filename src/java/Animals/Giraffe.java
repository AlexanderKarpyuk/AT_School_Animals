package Animals;

import Food.*;

public class Giraffe extends Herbivore {
    private static int count;
    private String name;

    public Giraffe() {
        count++;
        name = "Жираф №" + count;
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
