import java.io.*;
import java.util.Scanner;
//Заменить информацию в файле на информацию, введённую с клавиатуры
// append = false
public class Main {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter(System.getProperty("user.dir")+"\\note.txt", false))
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the text: ");
            writer.append(scan.nextLine());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}