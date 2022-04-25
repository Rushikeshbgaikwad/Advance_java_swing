import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button_change_color extends JFrame {
    JPanel p;
    Color bg=Color.BLUE;
    public button_change_color()
    {
        p=new JPanel(new BorderLayout());
        JButton bc=new JButton("Change color");
        p.add(bc,BorderLayout.SOUTH);
        bc.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                Color c=JColorChooser.showDialog(button_change_color.this,"Choose a color",bg);
                if(c!=null)
                {
                    bg=c;
                }
                p.setBackground(bg);
            }
        });
        setContentPane(p);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JColor Chooser Demo");
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new button_change_color();
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new button_change_color();
//            }
//        });
    }
}
