package view;

import model.ComputerParts;

import javax.swing.*;

public class ComputerView extends JFrame {
    private JPanel panel1;
    public JButton btnSave;
    public JButton btnCancel;
    private JTextField txtProcessor;
    private JTextField txtMouse;
    private JTextField txtKeyboard;
    private JTextField txtMonitor;
    //this is where we can show an error by introducing a new ComputerParts object
    public ComputerView (ComputerParts parts) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        add(panel1);
        txtMonitor.setText(parts.getMonitor());
        txtMouse.setText(parts.getMouse());
        txtKeyboard.setText(parts.getKeyboard());
        txtProcessor.setText(parts.getProcessor());
    }
    public void resetFields() {
        txtMonitor.setText("");
        txtKeyboard.setText("");
        txtMouse.setText("");
        txtProcessor.setText("");
    }
}
