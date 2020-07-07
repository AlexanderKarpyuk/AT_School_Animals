package ru.lanit.zoo.animals;


public class Giraffe extends Herbivore {
    protected static int count;

    public Giraffe() {
        count++;
        name = "Жираф №" + count;
    }

    @Override
    public String getName() {
        return name;
    }
}
