import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanetListUI extends JFrame {
    private JPanel contentPanel;
    private JPanel buttonPanel;
    private JButton btnAdd;
    private JButton btnRemove;
    private JTextField txtPlanetName;
    private JList planetList;
    //Add a default list model object
    DefaultListModel<String> listModel;

    public PlanetListUI(String title) {
        super.setTitle(title);
        initComponents();
        listModel = new DefaultListModel();
        listModel.addElement("Jupiter");
        listModel.addElement("Earth");
        listModel.addElement("Venus");
        listModel.addElement("Mars");
        planetList = new JList(listModel);
        //make sure at least one planet is selected
        planetList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        planetList.setSelectedIndex(0);
        JScrollPane listScrollPane = new JScrollPane(planetList);
        contentPanel.add(listScrollPane);
        add(contentPanel);
        setUpListeners();
    }
    public void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }
    public void setUpListeners() {
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtPlanetName.getText();
                if(name.equals("") || alreadyInList(name) || name.equals("Enter planet name here")) {
                    txtPlanetName.setText("Enter planet name here");
                }
                else {
                    int index = planetList.getSelectedIndex();
                    if (index == -1) {
                        index = 0;
                    } else {
                        index++;
                    }
                    listModel.insertElementAt(txtPlanetName.getText(), index);
                }
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = planetList.getSelectedIndex();
                listModel.remove(index);
                int size = listModel.getSize();
                if(size == 0) {
                    btnRemove.setEnabled(false);
                }
                else {
                    if (index == listModel.getSize()) {
                        index--;
                    }
                    planetList.setSelectedIndex(index);
                    planetList.ensureIndexIsVisible(index);
                }
            }
        });
    }
    //check for duplicates already in the list
    public boolean alreadyInList(String planetName) {
        for (int i = 0; i < listModel.getSize(); i++) {
            if (listModel.getElementAt(i).toString().equalsIgnoreCase(planetName)) {
                return true;
            }
        }
        return false;
    }
}
