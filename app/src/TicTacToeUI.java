import javax.swing.*;

public class TicTacToeUI extends JFrame{
    private JPanel contentPanel;
    public TicTacToeUI() {
        setTitle("Let's Play Tic Tac Toe");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPanel);
        setVisible(true);
    }
}
