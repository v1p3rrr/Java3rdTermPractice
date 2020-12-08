import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame
{
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JFrame window;
    MouseListener mouse = new MouseAdapter() {
        public void mouseEntered(MouseEvent e) {
            if (e.getSource()==panel1) JOptionPane.showMessageDialog(window, "CENTER");
            else if (e.getSource()==panel2) JOptionPane.showMessageDialog(window, "NORTH");
            else if (e.getSource()==panel3) JOptionPane.showMessageDialog(window, "SOUTH");
            else if (e.getSource()==panel4) JOptionPane.showMessageDialog(window, "EAST");
            else if (e.getSource()==panel5) JOptionPane.showMessageDialog(window, "WEST");
        }
    };

    public Window()
    {
        window = new JFrame("Lab #6 Window");
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(640, 480);
        window.setLayout(new BorderLayout());
        window.setResizable(false);


        panel1.setBackground(new Color(255, 0, 0));
        window.add(panel1, BorderLayout.CENTER);
        panel1.add(new JLabel("CENTER"));

        panel2.setBackground(new Color(0, 0, 255));
        window.add(panel2, BorderLayout.NORTH);
        panel2.add(new JLabel("        NORTH        "));
        panel2.setPreferredSize(new Dimension(0,120));

        panel3.setBackground(new Color(0, 255, 0));
        window.add(panel3, BorderLayout.SOUTH);
        panel3.add(new JLabel("        SOUTH        "));

        panel4.setBackground(new Color(255, 221, 0));
        window.add(panel4, BorderLayout.EAST);
        panel4.add(new JLabel("        EAST        "));

        panel5.setBackground(new Color(200, 0, 255));
        window.add(panel5, BorderLayout.WEST);
        panel5.add(new JLabel("        WEST        "));

        panel1.addMouseListener(mouse);
        panel2.addMouseListener(mouse);
        panel3.addMouseListener(mouse);
        panel4.addMouseListener(mouse);
        panel5.addMouseListener(mouse);
    }

}
