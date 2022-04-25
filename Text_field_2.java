import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text_field_2 implements ActionListener {
    static TextField t;
    static Frame f;
    static Button b;
    static Label l;

    public static void main(String[] args) {
        f=new Frame("textfield");
        l=new Label("nothing entered");
        b=new Button("submit");
        Text_field_2 tf=new Text_field_2();
        b.addActionListener(tf);
        t=new TextField("Enter the text",16);
        Panel p=new Panel();
        p.add(t);
        p.add(b);
        p.add(l);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if (s.equals("submit"))
        {
            l.setText(t.getText()+" ");

        }
    }
}
