import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class text_field_1 implements ActionListener {
    static Frame f;
    static Label l;
    static Button b;
    static TextArea t;
//
//    text_field_1()
//    {
//
//    }

    public static void main(String[] args) {
        f=new Frame("textfield");
        l=new Label("nothing entered");
        b=new Button("Submit");
        text_field_1 t1=new text_field_1();
        t=new TextArea();
        b.addActionListener(t1);
        t=new TextArea(10,10);
        JPanel p=new JPanel();

        p.add(t);
        p.add(b);
        p.add(l);

        f.add(p);
        f.setSize(500,500);
//        f.setLayout(null);
        f.show();
    }

    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if(s.equals("submit"));
        {
            l.setText(t.getText());
        }
    }
}
