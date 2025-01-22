import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCardLayout extends JFrame{
    private JPanel panel1;
    private JPanel buttonsPanel;
    private JPanel parentPanel;
    private JButton button1;
    private JButton button3;
    private JButton button2;
    private JPanel card1Panel;
    private JPanel card2Panel;
    private JPanel card3Panel;

    public void initComponents () {
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(450,400);
        setVisible(true);
    }
    public TestCardLayout() {
        initComponents();
        this.add(panel1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(card1Panel);
                parentPanel.revalidate();
                parentPanel.repaint();

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(card2Panel);
                parentPanel.revalidate();
                parentPanel.repaint();

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(card3Panel);
                parentPanel.revalidate();
                parentPanel.repaint();

            }
        });
    }
}
