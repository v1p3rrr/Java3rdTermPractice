package Chairs;

public class ChairFactory implements AbstractChairFactory {

    @Override
    public MagicChair createMagicalChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }
}
