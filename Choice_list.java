import java.awt.*;

public class Choice_list {
    Choice_list()
    {
        Frame f=new Frame();

        Choice c=new Choice();

        c.setBounds(150,100,150,50);
        c.add("Item 1");
        c.add("Item 2");
        c.add("item 3");
        c.add("Item 4");
        c.add("Item 5");

        f.add(c);
        f.setSize(400,400);
         f.setLayout(null);
         f.setVisible(true);
    }

    public static void main(String[] args) {
        new Choice_list();
    }
}
