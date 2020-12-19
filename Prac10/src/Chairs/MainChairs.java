package Chairs;

public class MainChairs {
    public static void main(String[] args) {
        Client client1 = new Client("Shiage");
        ChairFactory factory = new ChairFactory();
        client1.sit();
        client1.setChair(factory.createFunctionalChair());
        client1.sit();

        FunctionalChair chair1 = factory.createFunctionalChair();
        MagicChair chair2 = factory.createMagicalChair();
        VictorianChair chair3 = factory.createVictorianChair(30);

        client1.setChair(chair3);
        client1.sit();
        client1.setChair(chair2);
        client1.sit();
        client1.setChair(chair1);
        client1.sit();

        chair1.sit();
        System.out.println(chair1.sum(2,250));
        chair2.sit();
        chair2.doMagic();
        chair3.sit();
        System.out.println(chair3.getAge());
    }
}
