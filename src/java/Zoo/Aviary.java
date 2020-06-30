package Zoo;

import Animals.Animal;

public interface Aviary {
    int getSize();

    void addAnimal(Animal animal);

    Animal getAnimalByIndex(int index);
}
