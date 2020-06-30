package Animals;


public class Zebra extends Herbivore {
    protected static int count;

    public Zebra() {
        count++;
        name = "Зебра №" + count;
    }

    @Override
    public String getName() {
        return name;
    }

}
