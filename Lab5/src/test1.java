import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
class ShowPicture {
    public static void main(String args[]) {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:/Users/V1P3R/Pictures/Anime&Art/ToAru/Misaka Mikoto/ezgif.com-video-to-gif.gif");
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}