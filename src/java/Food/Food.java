package Food;

/**
 * Супер класс еда.
 */
public enum Food {
    BEEF("Говядина", false),
    BULL("Мясо быка", false),
    GRASS("Трава", true),
    CARROT("Морковь", true);

    private final String title;
    private final boolean isVegetable;

    Food(String title, boolean isVegetable) {
        this.title = title;
        this.isVegetable = isVegetable;
    }


    @Override
    public String toString() {
        return title;
    }
}
