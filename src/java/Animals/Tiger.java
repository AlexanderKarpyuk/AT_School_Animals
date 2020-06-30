package Animals;


public class Tiger extends Carnivorous {
    protected static int count;

    public Tiger() {
        count++;
        name = "Тигр №" + count;
    }

    @Override
    public String getName() {
        return name;
    }
}
