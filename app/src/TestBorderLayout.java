import javax.swing.*;

public class TestBorderLayout extends JFrame{
    private JPanel panel1;
    private JPanel westPanel;
    private JPanel eastPanel;
    private JPanel centerPanel;
    private JPanel northPanel;
    private JPanel southPanel;
    public TestBorderLayout ()  {
        initComponents();
    }
    public void initComponents () {
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,400);
        setVisible(true);
    }
}
