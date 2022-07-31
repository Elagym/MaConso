package be.verbeet.maconso.enumeration;

/**
 * Created by Vince on 11-06-22.
 */
public enum Category {
    BANK ("Bank, Pension"),
    CLEANING ("Cleaning products"),
    ELECTRONICS ("PC, Video games, Camera, ..."),
    FOOD("Food, Drinks"),
    GAMBLING ("Casino, Bookmaker"),
    INVESTMENT ("Stock market, Crypto"),
    PARTY ("Party"),
    RESOURCES ("Gaz, Electricity, Water, Internet, Phone"),
    SPORT ("Sport"),
    UNHEALTHY ("Drugs, Alcohol, Cigarettes"),
    OTHER("Other");

    private String description;

    Category(String description) {
        this.description = description;
    }

    public Category getByDescription(String category) {
        for (Category value : Category.values()) {
            if (value.description.equals(category)) {
                return value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Category{" +
                "description='" + description + '\'' +
                '}';
    }
}
