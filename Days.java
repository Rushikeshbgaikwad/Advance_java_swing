import javax.swing.*;

public class Days extends JFrame {
    //frame
    static JFrame f;

    //lists
    static JList b;

    public static void main(String[] args) {
        //create a new frame
        f= new JFrame("All days in weeks");
        //create object
        Days s = new Days();
        //create a panel
        JPanel p=new JPanel();
        //create a label
        JLabel l=new JLabel();
        //string array to store weekdays
        String week[]={"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        //create list
        b=new JList(week);

        //set a selected index
        b.setSelectedIndex(0);

        //add list to panel
        p.add(b);
        p.add(l);

        f.add(p);

        //set the size of frame
        f.setSize(400,400);
        f.show();

    }
}
