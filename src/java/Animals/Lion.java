package Animals;

import Food.*;

public class Lion extends Carnivorous {
    private static int count;
    private String name;

    public Lion() {
        count++;
        name = "Лев №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println(name + " ест " + food.getName());
        } else {
            System.out.println(name + " не ест такую еду");
        }
    }
}
