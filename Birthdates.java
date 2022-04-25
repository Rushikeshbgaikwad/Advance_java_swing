import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Birthdates extends JFrame implements ListSelectionListener {
    //frame
    static JFrame f;
    //lists
    static JList b,b1,b2;
    //lable
    static JLabel l1;

    public static void main(String[] args) {
        //create a new frame
        f=new JFrame("Frame");
        //create a object
        Birthdates s= new Birthdates();
        //create a panel
        JPanel p =new JPanel();
         //create a new lable
        JLabel l=new JLabel("Select your birthday");
        l1=new JLabel();

        //string array to store weekdays
        String month[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
        //create a array for months and year
        String date[]=new String[31],year[]=new String[31];
        //addmonth number and year to list
        for (int i=0;i<31;i++)
        {
            date[i]=""+(int)(i+1);
            year[i]=""+(int)(2022-i);
        }
        //create lists
        b=new JList(date);
        b1=new JList(month);
        b2=new JList(year);

        //set a selected index
        b.setSelectedIndex(0);
        b1.setSelectedIndex(0);
        b2.setSelectedIndex(0);

        //this line code is extra this line is used in valueChange class
        // l1.setText(b.getSelectedValue()+""+b1.getSelectedValue()+""+b2.getSelectedValue());

        //add item listener
        b.addListSelectionListener(s);
        b1.addListSelectionListener(s);
        b2.addListSelectionListener(s);

        //add list to panel
        p.add(l);
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(l1);

        f.add(p);

        //set the size of frame
        f.setSize(700,800);

        f.show();
    }
    public void valueChanged(ListSelectionEvent e )
    {
        l1.setText(b.getSelectedValue()+""+b1.getSelectedValue()+""+b2.getSelectedValue());
    }

}



