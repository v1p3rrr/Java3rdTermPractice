import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame
{
    JFrame window = new JFrame("Practice #4 Window");
    Font defFont = new Font("Acrobat Bold", Font.PLAIN, 20);
    JButton team1 = new JButton("Team #1");
    JButton team2 = new JButton("Team #2");
    private int t1 = 0;
    private int t2 = 0;
    JLabel result = new JLabel("Result "+t1+":"+t2);
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    Label winner = new Label("Winner: DRAW");
    public Window()
    {
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(320, 280);
        window.setLayout(new FlowLayout());

        team1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {Clicked(true);}});
        team2.addActionListener(e -> Clicked(false)); // same <-^

        window.add(team1);
        window.add(team2);
        window.add(result);
        window.add(winner);
        winner.setFont(defFont);
        result.setFont(defFont);
        window.add(lastScorer);


    }

    private void Clicked(boolean x)
    {
        if (x)
        {
            t1+=1;
            result.setText("Result "+t1+":"+t2);
            lastScorer.setText("Last Scorer: "+team1.getText());
        }
        else
        {
            t2+=1;
            result.setText("Result "+t1+":"+t2);
            lastScorer.setText("Last Scorer: "+team2.getText());
        }
        if (t1>t2)
            winner.setText("Winner: "+team1.getText());
        else if (t2>t1)
            winner.setText("Winner: "+team2.getText());
        else
            winner.setText("Winner: DRAW");

    }
}
