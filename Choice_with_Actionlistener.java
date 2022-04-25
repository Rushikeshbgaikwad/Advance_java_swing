import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choice_with_Actionlistener {
    Choice_with_Actionlistener()
    {
        Frame f =new Frame();

        final Label label=new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);

        Button b=new Button("Show");
        b.setBounds(100,150,100,50);

        final Choice c=new Choice();
        c.setBounds(100,100,100,50);

        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("ADV. Java");
        c.add("PHP");
        c.add("Andriod");
        c.add("Python");

        f.add(c);
        f.add(b);
        f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
            String data="Programming Language Selected = " + c.getItem(c.getSelectedIndex());
            label.setText(data);
            }
        });
    }

    public static void main(String[] args) {
        new Choice_with_Actionlistener();
    }
}
