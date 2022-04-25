import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class font_text extends JFrame implements ActionListener{
    static Frame f;
    static Label l,l1;
    static TextArea t;
    static Button b,b1,b2,b3;

    public static void main(String[] args) {
        f=new Frame("textfield");
        l=new Label("nthing entered");
        l1=new Label("0line");

        b=new Button("submit");
        b1=new Button("plain");
        b2=new Button("italic");
        b3=new Button("bold");
        font_text M=new font_text();
        b.addActionListener(M);
        b1.addActionListener(M);
        b2.addActionListener(M);
        b3.addActionListener(M);
        t=new TextArea("please write something ",10,10);
//        t.setSize(200,400);
        Panel p=new Panel();
        p.add(t);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        p.add(l1);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("submit"))
        {
            l.setText(t.getText()+"  ");
//            l1.setText(t.getWidth()+"line");
        }
        else if (s.equals("bold"))
        {
            Font f=new Font("Serif",Font.BOLD,15);
            t.setFont(f);
        }
        else if (s.equals("plain"))
        {
            Font p=new Font("serif",Font.PLAIN,15);
            t.setFont(p);
        }
        else if (s.equals("italic"))
        {
            Font i=new Font("Serif",Font.ITALIC,15);
            t.setFont(i);
        }
    }
}
