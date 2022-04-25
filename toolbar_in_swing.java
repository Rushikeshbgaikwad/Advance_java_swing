import javax.swing.*;

public class toolbar_in_swing extends JFrame {
//    private ActionListener event;

    public toolbar_in_swing()
    {
        initUi();
    }

    private void initUi()
    {
        createMenuBar();
        setTitle("Submenu");
        setSize(360,250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar()
    {
        var menuBar=new JMenuBar();
        var iconNew =new ImageIcon("new.png");
        var iconOpen =new ImageIcon("open.jpg");
        var iconSave =new ImageIcon("Save.png");
        var iconExit =new ImageIcon("Exit.png");

        var fileMenu = new JMenu("File");
        var impMenu = new JMenu("import");

        var newsMenuItem = new JMenuItem("import newsfeed list....");
        var bookmarksMenuItem = new JMenuItem("Import bookmarks...");
        var importMailMenuItem = new JMenuItem("Import mail");

        impMenu.add(newsMenuItem);
        impMenu.add(bookmarksMenuItem);
        impMenu.add(importMailMenuItem);

        var newMenuItem = new JMenuItem("New",iconNew);
        var openMenuItem = new JMenuItem("Open",iconOpen);
        var saveMenuItem = new JMenuItem("Save",iconSave);
        var exitMenuItem = new JMenuItem("Exit",iconExit);

        exitMenuItem.setToolTipText("Exit Application");
        exitMenuItem.addActionListener((event)->System.exit(0));

      fileMenu.add(newMenuItem);
      fileMenu.add(openMenuItem);
      fileMenu.add(saveMenuItem);
      fileMenu.addSeparator();
      fileMenu.add(impMenu);
      fileMenu.addSeparator();
      fileMenu.add(exitMenuItem);
      menuBar.add(fileMenu);
      setJMenuBar(menuBar);

      setVisible(true);

    }

    public static void main(String[] args) {
//        EventQueue.invokeLater(()-> {
//            var ex = new toolbar_in_swing();
//            ex.setVisible(true);
//        });
        new toolbar_in_swing();
    }
}

