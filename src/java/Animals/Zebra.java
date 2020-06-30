package Animals;

import Food.*;

public class Zebra extends Herbivore {
    public Zebra() {
        count++;
        name = "Зебра №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

}
