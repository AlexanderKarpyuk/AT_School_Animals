package Zoo;

import Animals.Carnivorous;

import java.util.ArrayList;
import java.util.List;

public class AviaryCarnivorous {
    private List<Carnivorous> animals = new ArrayList<>();
    private int size;

    public AviaryCarnivorous(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Размер вольера не может быть меньше 1");
        }
    }

    public void addAnimal(Carnivorous animal) {
        if (size > animals.size()) {
            animals.add(animal);
        } else {
            System.out.println("В вольере нету места");
        }
    }
}
