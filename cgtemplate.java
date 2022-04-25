import javax.swing.*;
import java.awt.*;

public class cgtemplate extends JFrame {
    public static final int CANVAS_WIDTH = 640;
    public static final int CANVAS_HEIGHT = 480;

    private DrawCanvas canvas;

    public cgtemplate()
    {
        canvas=new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH,CANVAS_HEIGHT));

        Container cp =getContentPane();
        cp.add(canvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("...............");
        setVisible(true);
    }
    private class DrawCanvas extends JPanel
    {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.BLACK);
            g.setColor(Color.YELLOW);
            g.drawLine(100,40,100,200);
            g.drawOval(150,180,10,10);
            g.drawRect(200,210,20,30);
            g.setColor(Color.red);
            g.fillOval(300,310,30,50);
            g.fillRect(400,350,60,50);
            g.setColor(Color.white);
            g.setFont(new Font("Monospaced",Font.PLAIN,30));
            g.drawString("Testing Custom drawing......",10,20);
        }
    }

    public static void main(String[] args) {
        new cgtemplate();
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new cgtemplate();
//            }
//        });
    }

}
