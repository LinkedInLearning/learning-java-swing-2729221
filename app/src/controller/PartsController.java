package controller;

import model.ComputerParts;
import view.ComputerView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PartsController implements ActionListener {
    public ComputerView computerViewUI;

    public PartsController() {
        computerViewUI = new ComputerView(getInfo());
        addListeners();
        computerViewUI.setVisible(true);

    }
    public void addListeners(){
        computerViewUI.btnCancel.addActionListener(this);
        computerViewUI.btnSave.addActionListener(this);
    }
    public ComputerParts getInfo() {
        ComputerParts partsInfo = new ComputerParts();
        partsInfo.setKeyboard("Wireless");
        partsInfo.setMonitor("Samsung 36 inches");
        partsInfo.setMouse("Wired");
        partsInfo.setProcessor("Intel");
        return partsInfo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if(obj.equals(computerViewUI.btnSave)) {
            System.out.println("The save button has been pressed");
        }
        else if(obj.equals(computerViewUI.btnCancel)) {
            computerViewUI.resetFields();
        }
    }
}
