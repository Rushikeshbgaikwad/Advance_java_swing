import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Textfield_and_boldFont implements ActionListener {
    static Frame f;
    static Label l;
    static TextField t;
    static Button b;

    public static void main(String[] args) {
        f=new Frame("Textfield");
        l=new Label("Nothing Entered");
        b=new Button("submit");
        Textfield_and_boldFont tb=new Textfield_and_boldFont();
        b.addActionListener(tb);
        t=new TextField(16);
        Font fo=new Font("serif",Font.BOLD,20);
        t.setFont(fo);
        Panel p=new Panel();
        p.add(t);
        p.add(b);
        p.add(l);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s=e.getActionCommand();
        if (s.equals("submit"));
        {
            l.setText(t.getText()+" ");
        }
    }
}
