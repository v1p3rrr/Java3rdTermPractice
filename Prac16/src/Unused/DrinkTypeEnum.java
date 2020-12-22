package Unused;

public enum DrinkTypeEnum {

    BEER(0.03),
    WINE(0.1),
    VODKA(0.5),
    BRANDY(0.3),
    CHAMPAGNE(0.15),
    WHISKEY(0.4),
    TEQUILA(0.25),
    RUM(0.2),
    VERMOUTH(0.2),
    LIQUOR(0.15),
    JUICE(0),
    COFFEE(0),
    GREEN_TEA(0),
    BLACK_TEA(0),
    MILK(0),
    WATER(0),
    SODA(0);

    private final double AlcoholVal;

    DrinkTypeEnum(double AlcoholVal){
        this.AlcoholVal = AlcoholVal;
    }

    public double getAlcoholVal() {
        return AlcoholVal;
    }
}
