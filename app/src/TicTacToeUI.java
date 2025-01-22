import javax.swing.*;

public class TicTacToeUI extends JFrame{
    private JPanel contentPanel;
    private JPanel col1row1;
    private JPanel col1row2;
    private JPanel col1row3;

    TicTacToeUI() {
        setTitle("Let’s Play Tic Tac Toe");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPanel);
        setVisible(true);
    }

}
