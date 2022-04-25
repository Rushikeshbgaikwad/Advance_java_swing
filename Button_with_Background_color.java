import javax.swing.*;
import java.awt.*;

public class Button_with_Background_color {

    static JFrame f;
    static JButton b,b1,b2;
    static JLabel l;

    Button_with_Background_color()
    {
        f=new JFrame("Panel");
        l = new JLabel("This is all button");
        b=new JButton("button 1");
        b1=new JButton("button 2");
        b2=new JButton("button 3");

        JPanel p=new JPanel();
        p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.setBackground(Color.red);

        f.add(p);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Button_with_Background_color();
    }
}
