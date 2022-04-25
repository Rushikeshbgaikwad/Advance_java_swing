import javax.swing.*;
import java.awt.*;

public class box_layout_button extends Frame {
    Button buttonBox[];

    box_layout_button()
    {
        buttonBox=new Button[2];
        for(int i=0;i<2;i++)
        {
            buttonBox[i]=new Button("**Button**"+(i+1)+"**");
            add(buttonBox[i]);
        }
        setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {

        box_layout_button b=new box_layout_button();
    }

}
