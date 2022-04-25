import javax.swing.*;
import java.awt.*;

public class Border_Layout {
    JFrame f;
    JButton b,b1,b2,b3;
    JLabel l;
    Border_Layout()
    {
        f=new JFrame("Panel");
        l=new JLabel("Panel Label");
        b=new JButton("button 1");
        b1=new JButton("button 2");
        b2=new JButton("button 3");
        b3=new JButton("button 4");

        JPanel p=new JPanel(new java.awt.BorderLayout());
        p.add(b, BorderLayout.NORTH);
        p.add(b1, BorderLayout.SOUTH);
        p.add(b2, BorderLayout.EAST);
        p.add(b3, BorderLayout.WEST);
        p.add(l,BorderLayout.CENTER);
        p.setBackground(Color.red);

        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Border_Layout();
    }
}
