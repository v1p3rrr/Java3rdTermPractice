package Chairs;

public class Client {
    private Chair chair=null;

    private String name;

    public Client(String name){
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sit(){
        if (chair==null){
            System.out.println("set the chair first");
        } else {
            System.out.print(this.name + " ");
            chair.sit();
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }



}
