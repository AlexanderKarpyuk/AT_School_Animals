package Animals;


public class Lion extends Carnivorous {
    protected static int count;

    public Lion() {
        count++;
        name = "Лев №" + count;
    }

    @Override
    public String getName() {
        return name;
    }
}
