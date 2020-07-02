package Food;

/**
 * Супер класс еда.
 */
public enum Food {
    BEEF("Говядина", false),
    BULL("Мясо быка", false),
    GRASS("Трава", false),
    CARROT("Морковь", false);

    private final String title;
    private final boolean isVegetable;

    Food(String title, boolean isVegetable) {
        this.title = title;
        this.isVegetable = isVegetable;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVegetable() {
        return isVegetable;
    }
}
