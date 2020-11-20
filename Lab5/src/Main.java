// Вар. 2 (23) Создать окно, отобразить в нем картинку, путь к которой указан в аргументах командной строки.
// Работает даже с gif-картинками, по сути, выполняется и вариант 3.
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input path to the picture: ");
        new Window(scan.nextLine());
    }
}
