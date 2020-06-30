package Animals;

import Food.*;

public class Tiger extends Carnivorous {
    public Tiger() {
        count++;
        name = "Тигр №" + count;
    }

    @Override
    public String getName() {
        return name;
    }
}
