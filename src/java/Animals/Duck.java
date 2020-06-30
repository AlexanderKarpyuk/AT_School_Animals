package Animals;


/**
 * Утка управляет зоопраком, поэтому она может быть только одна.
 * И в вольер её не нужен.
 */
public class Duck {
    private Duck duck;

    private Duck() {

    }

    public Duck getInstance() {
        if (duck == null) {
            duck = new Duck();
        }
        return duck;
    }
}
