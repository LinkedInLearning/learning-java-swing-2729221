package view;

import controller.PartsController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame{
    private JButton btnWelcome;
    private JPanel panel1;
    public Welcome() {
        setTitle("Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        add(panel1);
        btnWelcome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PartsController partsController = new PartsController();

            }
        });

    }
}
