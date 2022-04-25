import javax.swing.*;
import java.awt.*;

public class Grid_layout {
    JFrame f;
    JButton b,b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel l;
    JPanel p;
    Grid_layout()
    {
        f=new JFrame();
        l=new JLabel("all buttion");
        b=new JButton("1");
        b1=new JButton("2");
        b2=new JButton("3");
        b3=new JButton("4");
        b4=new JButton("5");
        b5=new JButton("6");
        b6=new JButton("7");
        b7=new JButton("8");
        b8=new JButton("9");
//        p=new JPanel();
//        p.add(l);
//        p.add(b);
//        p.add(b1);
//        p.add(b2);
//        p.add(b3);
//        p.add(b4);
//        p.add(b5);
//        p.add(b6);
//        p.add(b7);
//        p.add(b8);
//        f.add(p);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.setLayout(new GridLayout());

        f.setSize(500,500);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new Grid_layout();
    }
}
