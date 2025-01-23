import javax.swing.*;
import java.awt.*;

public class TestBoxLayout extends JFrame{
    private JPanel panel1;

    public TestBoxLayout() {
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        JTextField name = new JTextField("Enter your name");
        name.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel1.add(name);
        JLabel label = new JLabel("Here is a label");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel1.add(label);
        addAButton("Save", panel1);
        addAButton("Cancel", panel1);
        addAButton("Update", panel1);
        addAButton("Request more time", panel1);
        addAButton("2024", panel1);
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,300);
        setVisible(true);
    }
    private static void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }


}