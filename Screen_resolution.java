import java.awt.*;

public class Screen_resolution {

    public static void main(String[] args) {
        Toolkit t=Toolkit.getDefaultToolkit();
        System.out.println("Screen Resolution = "+t.getScreenResolution());
        Dimension d=t.getScreenSize();
        System.out.println("Screen Width = "+d.width);
        System.out.println("Screen height = "+d.height);
    }
}
