package Chairs;

public class MagicChair implements Chair {
    public void doMagic(){
        System.out.println("(づ｡◕‿‿◕｡)づ Magic!");
    }

    @Override
    public void sit() {
        System.out.println("Successfully sat down on MaGiC chair");
    }
}
