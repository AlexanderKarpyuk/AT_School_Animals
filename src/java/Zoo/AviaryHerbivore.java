package Zoo;


import Animals.Carnivorous;
import Animals.Herbivore;

import java.util.ArrayList;
import java.util.List;

public class AviaryHerbivore {
    private List<Herbivore> animals = new ArrayList<>();
    private int size;

    public AviaryHerbivore(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Размер вольера не может быть меньше 1");
        }
    }

    public void addAnimal(Herbivore animal) {
        if (size > animals.size()) {
            animals.add(animal);
        } else {
            System.out.println("В вольере нету места");
        }
    }
}
