import javax.swing.*;

public class TestFlowLayout extends JFrame{
    private JPanel panel1;
    private JTextField txtField1;
    private JButton clickMeButton;
    private JSlider slider1;
    private JTextArea thisIsAJTextAreaTextArea;
    private JRadioButton radioButton1;
    public TestFlowLayout ()  {
        initComponents();
    }
    public void initComponents () {
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,400);
        setVisible(true);
    }
}
