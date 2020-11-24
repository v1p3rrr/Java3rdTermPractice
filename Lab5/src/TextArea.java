import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextArea extends JFrame
{
    JTextArea jta1 = new JTextArea(10, 25);
    JButton button = new JButton("Add some Text");
    //JTextArea txtArea = new JTextArea(20,20);
    JScrollPane jScroll = new JScrollPane(jta1);

    public TextArea()
    {
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        //add(jta1);
        add(button);
        add(jScroll);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null, "Insert some text");
                jta1.append(txt);
            }
        });
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
