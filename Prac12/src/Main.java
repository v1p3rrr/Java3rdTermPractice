import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(" -- Task 1 - full name -- \n");
        Person p1 = new Person("Ivanov");
        Person p2 = new Person("Petrov", "Petr", "Petrovich");

//        System.out.println(p1);
//        System.out.println(p2);

        p1.printName();
        p2.printName();



        System.out.println("\n\n -- Task 2 address -- \n");
        Address a1 = new Address("Russia, Moscow, Moscow, Tverskaya, 22, 2, 102");
        System.out.println(a1);
        Address a2 = new Address("Russia; Moscow; Moscow City; Tverskaya-Yamskaya; 22; 2; 102");
        System.out.println(a2);
        Address a3 = new Address("    Russia; Moscow, Moscow. Tverskaya. 22; 2, 102  ");
        System.out.println(a3);

        try {
        Address a4 = new Address("    Russia; Moscow,, Moscow. Tverskaya. 22; 2, 102  ");
        System.out.println(a4);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

        try {
            Address a5 = new Address("abcdefg");
            System.out.println(a5);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

        try {
            Address a6 = new Address("Russia; 22Moscow; Moscow; Tverskaya; 22; 2; 102");
            System.out.println(a6);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }



        System.out.println("\n\n -- Task 3 shirts -- \n");

        String [] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Pattern shirtPattern = Pattern.compile("([\\s\\w]+),([\\s\\w-]+),([\\s\\w]+),([\\s\\w]+)");
        for (String st : shirts){
            if (shirtPattern.matcher(st).matches()){
                String[] t = st.split(",");
                Shirt shirt = new Shirt(t);
                System.out.println(shirt);
            }
        }



        System.out.println("\n\n -- Task 4 phone number -- \n");

        Number number = new Number("+79151234576");
        Number number1 = new Number("89997714976");
        Number number2 = new Number("+1009851234567");
        Number number3 = new Number("899912345678");
    }
}
