public final class Dish implements MenuItem {


    private final int DEFAULT_PRICE = 0;

    private final int cost;
    private final String name;
    private final String description;

    public Dish(int cost, String name, String description) throws Exception {
        if (name.equals("") || description.equals("") || cost < 0) {
            throw new IllegalArgumentException("Illegal Argument");
        } else {
            this.cost = cost;
            this.name = name;
            this.description = description;
        }
    }

    public Dish(String name, String description) throws Exception {
        if (name.equals("") || description.equals("")) {
            throw new Exception("java.lang.IllegalArgumentException ");
        } else {
            this.cost = DEFAULT_PRICE;
            this.name = name;
            this.description = description;
        }
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return name;
    }
}
