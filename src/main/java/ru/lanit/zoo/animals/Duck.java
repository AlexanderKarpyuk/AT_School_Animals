package ru.lanit.zoo.animals;


/**
 * Утка управляет зоопраком, поэтому она может быть только одна.
 * И в вольер её не нужен.
 */
public class Duck {
    private String name = "Утка";
    private static Duck duck;

    private Duck() {

    }

    public static Duck getInstance() {
        if (duck == null) {
            duck = new Duck();
        }
        return duck;
    }

    public void say() {
        System.out.println("Кря-кря");
    }
}
