import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorldUI extends JFrame{
    private JPanel panel1;
    private JButton btnClickMe;
    private JLabel lblTitle;
    private JLabel lblMessage;
    public HelloWorldUI() {
        add(panel1);
        this.setSize(300,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnClickMe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMessage.setText("Button has been clicked, Hello World!");
            }
        });

    }
}
