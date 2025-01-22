import javax.swing.*;

public class TestGridLayout extends JFrame {
    private JPanel panel1;
    public TestGridLayout () {
        initComponents();
    }
    public void initComponents () {
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,400);
        setVisible(true);
    }
}
