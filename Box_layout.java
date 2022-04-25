import javax.swing.*;
import java.awt.*;

public class Box_layout {
    JFrame f;
    JButton b,b1,b2,b3;
    JLabel l;
    JPanel p;
    Box_layout()
    {
        f=new JFrame("panel");
        l=new JLabel("Panel label");
        b=new JButton("button 1");
        b1=new JButton("button 2");
        b2=new JButton("button 3");
        b3=new JButton("button 4");
        p=new JPanel();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        p.setBackground(Color.green);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Box_layout();
    }
}
