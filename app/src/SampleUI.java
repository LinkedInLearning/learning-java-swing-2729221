import javax.swing.*;
import java.awt.*;

public class SampleUI extends JFrame{
    private JPanel contentPanel;
    private JTextField txtName;
    private JTextField txtTitle;
    private JButton btnButton1;
    private JButton btnButton2;
    private JRadioButton tuesdayRadioButton;
    private JRadioButton fridayRadioButton;
    private JRadioButton mondayRadioButton;
    private JRadioButton wednesdayRadioButton;
    private JRadioButton thursdayRadioButton;
    private JComboBox shiftSelection;
    private JCheckBox partTimeCheckBox;
    private JCheckBox fullTimeCheckBox;
    private JCheckBox overtimeCheckBox;
    private JPanel labelPanel;
    private JPanel buttonPanel;
    private JPanel radioBtnPanel;
    private JPanel chkBoxPanel;
    public SampleUI() {
        setTitle("Sample UI");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setupRadioGroup();
        setupShiftSelection();
        add(contentPanel);
    }
    public void setupRadioGroup(){
        ButtonGroup group = new ButtonGroup();
        group.add(mondayRadioButton);
        group.add(tuesdayRadioButton);
        group.add(wednesdayRadioButton);
        group.add(thursdayRadioButton);
        group.add(fridayRadioButton);
        mondayRadioButton.isSelected();
    }
    public void setupShiftSelection() {
        shiftSelection.addItem("Morning");
        shiftSelection.addItem("Afternoon");
        shiftSelection.addItem("Evening");

    }
}
