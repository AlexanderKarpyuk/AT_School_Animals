package Zoo;


import Animals.Animal;
import Animals.Carnivorous;
import Animals.Herbivore;

import java.util.ArrayList;
import java.util.List;

public class AviaryHerbivore implements Aviary {
    private List<Herbivore> animals = new ArrayList<>();
    private int size;

    public AviaryHerbivore(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Размер вольера не может быть меньше 1");
        }
    }

    public int getSize() {
        return size;
    }

    public void addAnimal(Animal animal) {
        if (size > animals.size() && animal instanceof Herbivore) {
            animals.add((Herbivore) animal);
        } else {
            System.out.println("В вольере нету места");
        }
    }

    public Animal getAnimalByIndex(int index) {
        if (0 <= index && index < size) {
            return animals.get(index);
        } else if (index < 0) {
            System.out.println("Индекс не может быть меньше нуля");
        } else {
            System.out.println("Животного с таким идексом нету");
        }
        return null;
    }
}
