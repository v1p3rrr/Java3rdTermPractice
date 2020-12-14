import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void login(ArrayList<User> userList)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scan.nextLine();
        boolean found=false;
        for (int i=0;i<userList.size();i++) {
            if (name.equals(userList.get(i).getName())) {
                found=true;
                System.out.println("Your name was found in user base");
                try {
                    System.out.print("Enter your INN: ");
                    long inn = Long.parseLong(scan.nextLine());
                    if (inn == userList.get(i).getInn()){
                        System.out.println("Successfully logged in");
                        return;}
                    else
                        try {
                            throw new Exception("Entered INN doesn't match your name");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.print("Do you want to try again? Type \"y\": ");
                            if (scan.nextLine().equals("y"))
                                login(userList);
                        }
                } catch (Exception e) {
                    System.out.println("Invalid number");
                    System.out.print("Do you want to try again? Type \"y\": ");
                    if (scan.nextLine().equals("y"))
                        login(userList);
                }
            }
        }
        if (!found){System.out.print("Name not found. Do you want to try again? Type \"y\": ");
            if (scan.nextLine().equals("y"))
                login(userList);}
    }


    public static void main(String[] args)
    {

        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("Ben", 1337));
        userList.add(new User("John", 3333));
        userList.add(new User("A", 1234));


       login(userList);

    }
}
