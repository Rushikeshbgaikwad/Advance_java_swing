import javax.swing.*;
import java.awt.*;

public class Cursors_to_components extends JFrame {
    static JFrame f;
    static Label l,l1,l2;

    Cursors_to_components()
    {

    }

    public static void main(String[] args) {
        try{
            f=new JFrame("Cursor");

            JPanel p=new JPanel();
            l=new Label("label One");
            l1=new Label("label Two");
            l2=new Label("label Three");

            Cursor c=new Cursor(Cursor.CROSSHAIR_CURSOR);
            Cursor c1=new Cursor(Cursor.HAND_CURSOR);
            Cursor c2=Cursor.getSystemCustomCursor("Invaild.32x32");

            l.setCursor(c);
            l1.setCursor(c1);
            l2.setCursor(c2);

            p.add(l);
            p.add(l1);
            p.add(l2);

            f.add(p);
            f.setSize(400,400);
            f.show(true);

        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
