import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration_form extends JFrame implements ActionListener {
   private Container c;
   private Label title;
   private Label name;
   private Label mno;
   private TextField tname;
   private TextField tmno;
   private Label gender;
   private JRadioButton male;
   private JRadioButton female;
   private ButtonGroup gengp;
   private Label dob;
   private JComboBox date;
   private JComboBox month;
   private JComboBox year;
   private Label add;
   private JTextArea tadd;
   private JCheckBox term;
   private Button sub;
   private Button reset;
   private JTextArea tout;
   private Label res;
   private JTextArea resadd;

   private String dates[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22",
           "23","24","25","26","27","28","29","30","31"};
   private String months[]={"Jan","Feb","Mar","Apr","may","Jun","jul","Aug","Sep","Oct","Nov","Dec"};

   private String years[]={"1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008",
            "2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022"};
   public Registration_form()
   {
         setTitle("Registration Form");
         setBounds(300,90,900,800);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setResizable(true);

         c=getContentPane();
         c.setLayout(null);

         title=new Label("Registration form");
         title.setFont(new Font("Arial",Font.PLAIN,30));
         title.setSize(300,30);
         title.setLocation(350,30);
         c.add(title);

         name=new Label("name");
         name.setFont(new Font("Arial",Font.PLAIN,20));
         name.setSize(75,20);
         name.setLocation(100,105);
         c.add(name);

         tname=new TextField();
         tname.setFont(new Font("Arial",Font.PLAIN,25));
         tname.setSize(500,35);
         tname.setLocation(200,100);
         c.add(tname);

         mno=new Label("mobile");
         mno.setFont(new Font("Arial",Font.PLAIN,20));
         mno.setSize(75,20);
         mno.setLocation(100,155);
         c.add(mno);

         tmno=new TextField();
         tmno.setFont(new Font("Arial",Font.PLAIN,20));
         tmno.setSize(500,30);
         tmno.setLocation(200,150);
         c.add(tmno);

         gender=new Label("Gender");
         gender.setFont(new Font("Arial",Font.PLAIN,20));
         gender.setSize(80,20);
         gender.setLocation(100,200);
         c.add(gender);

         male=new JRadioButton("Male");
         male.setFont(new Font("Arial",Font.PLAIN,15));
         male.setSelected(true);
         male.setSize(75,20);
         male.setLocation(200,200);
         c.add(male);

         female=new JRadioButton("Female");
         female.setFont(new Font("Arial",Font.PLAIN,15));
         female.setSelected(false);
         female.setSize(120,20);
         female.setLocation(275,200);
         c.add(female);

         gengp=new ButtonGroup();
         gengp.add(male);
         gengp.add(female);

         dob=new Label("DOB");
         dob.setFont(new Font("Arial",Font.PLAIN,20));
         dob.setSize(75,20);
         dob.setLocation(100,252);
         c.add(dob);

         date=new JComboBox<>(dates);
         date.setFont(new Font("Arial",Font.PLAIN,20));
         date.setSize(100,25);
         date.setLocation(200,250);
         c.add(date);

         month=new JComboBox<>(months);
         month.setFont(new Font("Arial",Font.PLAIN,20));
         month.setSize(100,25);
         month.setLocation(310,250);
         c.add(month);

         year=new JComboBox<>(years);
         year.setFont(new Font("Arial",Font.PLAIN,20));
         year.setSize(100,25);
         year.setLocation(420,250);
         c.add(year);

         add=new Label("Address");
         add.setFont((new Font("Arial",Font.PLAIN,20)));
         add.setSize(75,20);
         add.setLocation(100,300);
         c.add(add);

         tadd=new JTextArea();
         tadd.setFont((new Font("Arial",Font.PLAIN,20)));
         tadd.setSize(500,70);
         tadd.setLocation(200,300);
         tadd.setLineWrap(true);
         c.add(tadd);

         term = new JCheckBox("Accept Terms And Conditions");
         term.setFont(new Font("Arial",Font.PLAIN,15));
         term.setSize(250,20);
         term.setLocation(150,400);
         c.add(term);

         sub=new Button("Submit");
         sub.setFont(new Font("Arial",Font.PLAIN,15));
         sub.setSize(100,20);
         sub.setLocation(150,450);
         c.add(sub);

         reset=new Button("Reset");
         reset.setFont(new Font("Arial",Font.PLAIN,20));
         reset.setSize(100,20);
         reset.setLocation(270,450);
         c.add(reset);

         tout=new JTextArea();
         tout.setFont(new Font("Arial",Font.PLAIN,20));
         tout.setSize(500,200);
         tout.setLocation(200,550);
         tout.setEditable(false);
         tout.setLineWrap(true);
         c.add(tout);

         res=new Label();
         res.setFont(new Font("Arial",Font.PLAIN,20));
         res.setSize(500,20);
         res.setLocation(150,500);
         c.add(res);

         resadd=new JTextArea();
         resadd.setFont(new Font("Arial",Font.PLAIN,20));
         resadd.setSize(200,75);
         resadd.setLocation(580,550);
         resadd.setLineWrap(true);
         c.add(resadd);

         setVisible(true);
   }


    public void actionPerformed(ActionEvent e)
    {
//        String s=e.getActionCommand();
        if (e.getSource()==sub)
        {
            if(term.isSelected())
            {
                String data1;
                String data ="name :"+tname.getText()+"\n"+"Mobile :"+tmno.getText()+"\n";

                if (male.isSelected())
                    data1="Gender : Male \n";
                else
                    data1="Gender : Female \n";

                String data2="DOB : "+(String)date.getSelectedItem()+"/"+(String)month.getSelectedItem()+"/"+
                        (String)year.getSelectedItem()+"\n";

                String data3="Address = "+tadd.getText();
                tout.setText(data+data1+data2+data3);
                tout.setEditable(false);
                res.setText("Registration Successfully....");
            }
            else{
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the terms and conditions");
            }
        }
        else if (e.getSource()==reset)
        {
            String def="";
            tname.setText(def);
            tadd.setText(def);
            tmno.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }

    }

}
class Main
{
    public static void main(String[] args) {
        Registration_form r=new Registration_form();
    }
}