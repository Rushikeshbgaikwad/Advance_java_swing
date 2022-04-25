import javax.swing.*;

public class Table_with_scrollpanel {
    JFrame f;
    JTable t;

    Table_with_scrollpanel()
    {
     f=new JFrame();
     f.setTitle("JTable Example");
            //data to be display in the JTable

        String[][] Data=
                 {
                {"lokesh","4031","CSE"},
                {"Rushikesh","6014","IT"},{"Mayuri","5019","CSE"}
                };
        String [] columnNames={"Name","Roll no","Department"};
        t=new JTable(Data,columnNames);
        t.setBounds(30,40,200,300);
        JScrollPane s=new JScrollPane(t);
        f.add(s);
        f.setSize(500,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Table_with_scrollpanel();
    }
}
