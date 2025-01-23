import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ExampleEventsUI extends JFrame  {
    private JPanel panel1;
    private JButton btnButton1;
    private JButton btnButton2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JTextArea txtArea;
    private JLabel lblTextArea;
    private JComboBox<String> comboBox1;


    public ExampleEventsUI() {

        initComponents();
        add(panel1);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initComponents() {
        comboBox1 = new JComboBox<String>();
        comboBox1.addItem("item1");
        comboBox1.addItem("item2");
        comboBox1.addItem("item3");
        comboBox1.addItem("item4");
        comboBox1.addItem("item5");
        comboBox1.addItem("item6");
        comboBox1.addItem("item7");
        comboBox1.setVisible(true);


    }

}
