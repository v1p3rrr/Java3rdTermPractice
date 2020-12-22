import Unused.DrinkTypeEnum;

public final class Drink implements MenuItem, Alcoholable {

    private final int DEFAULT_PRICE = 0;

    private final int cost;
    private final String name;
    private final String description;
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(String name, int cost, String description) throws Exception {
        if (name.equals("") || description.equals("") || cost < 0) {
            throw new IllegalArgumentException("Illegal Argument");
        } else {
            this.cost = cost;
            this.name = name;
            this.description = description;
        }
    }

    public Drink(String name, String description) throws Exception {
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
    public boolean isAlcoholicDrink() {
        return alcoholVol != 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    @Override
    public String toString() {
        return name;
    }
}
