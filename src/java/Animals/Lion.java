package Animals;

import Food.*;

public class Lion extends Carnivorous {
    public Lion() {
        count++;
        name = "Лев №" + count;
    }

    @Override
    public String getName() {
        return name;
    }
}
