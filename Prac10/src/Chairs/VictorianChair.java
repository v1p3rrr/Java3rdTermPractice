package Chairs;

public class VictorianChair implements Chair{
    private int age = 0;

    public VictorianChair(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Successfully sat down on Victorian chair");
    }
}
