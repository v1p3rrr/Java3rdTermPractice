import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame
{
    JFrame mainFrame = new JFrame();
    JLabel label1 = new JLabel();
    String filename;

    public Window(String filename)
    {
        this.filename = filename;
        if (ImageAvailabilityChecker()) // Проверка на действительность введённого пути к изображению.
            CreateImageViewer(); // Создание окна через метод (то есть не в самом конструкторе) и вывод изображения, при чём, окно само фиксируется под размер изображения.
        else
            CreateErrorMessage(); // Вывод сообщения об ошибке в консоль и создание окна с надписью об ошибке в введённом пути.
    }

    public void CreateImageViewer()
    {
        mainFrame.setTitle("Image viewer");
        label1.setIcon(new ImageIcon(filename));
        mainFrame.add(label1);
        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
    }

    public void CreateErrorMessage()
    {
        mainFrame.setTitle("Error");
        mainFrame.setSize(300, 100);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(new JLabel("Invalid image path"));
        mainFrame.setResizable(false);
    }

    public boolean ImageAvailabilityChecker()
    {
        try { Image img = ImageIO.read(new File(filename)); }
        catch(IOException e) {System.err.println("Caught IOException: " +  e.getMessage()); return false;}
        return true;
    }
}
