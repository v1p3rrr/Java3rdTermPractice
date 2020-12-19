package Chairs;

public interface AbstractChairFactory {
    public MagicChair createMagicalChair();

    public FunctionalChair createFunctionalChair();

    public VictorianChair createVictorianChair(int age);
}
