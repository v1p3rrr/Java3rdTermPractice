import java.util.Scanner;

public class Exception1
{
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public void exceptionDemo2()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer number:");
        String intString=scan.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        //catch (Exception e){System.out.println("Catching exception of Exception class which is the parent of other 2 exception classes catches them as well");}
        catch(ArithmeticException e)
        {
            System.out.println("Attempted division by zero or other arithmetic mistake.");
            exceptionDemo2();
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid number. It must be an integer.");
            exceptionDemo2();
        }
        finally
        {
            System.out.println("The program has finished its work. This block runs in any case.");
        }
    }



// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-



    private String getDetails(String key) throws Exception {
        //if (key == null)
        {
            //throw new NullPointerException("Error: null key in getDetails");
        }
        if (key.equals(""))
        {
            throw new Exception("Key is empty");
        }
        return ("your key is: "+key);
    }

    public void printDetails(String key) throws Exception {
        //try
        {
            String msg = getDetails(key); // method get called
            System.out.println(msg);
        }
        //catch(Exception e) // if exception was thrown
        {
            //System.out.println(e.getMessage()); // prints the message of that NullPointerException (Exception)
            //throw e; // throws the exception further
        }
    }

    public void getKey()
    {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        //String key = "";
        try
        {
            printDetails(key);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            getKey();
        }
    }
}
