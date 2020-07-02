package Food;

/**
 * Перечисление видов еды для животных зоопарка.
 * Где поле isVegetable указывает тип еды: true = растительного, false = животного происхождения.
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

    public String getTitle() {
        return title;
    }

    public boolean isVegetable() {
        return isVegetable;
    }

    @Override
    public String toString() {
        return title;
    }
}
