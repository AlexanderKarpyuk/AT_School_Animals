package Animals;

import Food.*;

public class Giraffe extends Herbivore {
    public Giraffe() {
        count++;
        name = "Жираф №" + count;
    }

    @Override
    public String getName() {
        return name;
    }
}
