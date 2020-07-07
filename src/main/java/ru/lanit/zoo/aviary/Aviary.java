package ru.lanit.zoo.aviary;

import ru.lanit.zoo.animals.Animal;

public interface Aviary {
    int getSize();

    int getCount();

    void addAnimal(Animal animal);

    Animal getAnimalByIndex(int index);
}
