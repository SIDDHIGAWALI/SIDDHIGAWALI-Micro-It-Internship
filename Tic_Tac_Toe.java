import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToeGame extends JFrame implements ActionListener {
private JButton[] buttons;
private boolean isX = true;
public TicTacToeGame() {
 buttons = new JButton[9];
 setTitle("Tic Tac Toe");
 setLayout(new GridLayout(3, 3));
 for (int i = 0; i < 9; i++) {
 buttons[i] = new JButton("");
 buttons[i].setFont(new Font("Arial", Font.PLAIN, 80));
 buttons[i].setFocusPainted(false);
 buttons[i].addActionListener(this);
add(buttons[i]);
 }

 setSize(300, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLocationRelativeTo(null);
 setVisible(true);
 }

public void actionPerformed(ActionEvent e) {
 JButton buttonClicked = (JButton) e.getSource();
 if (isX) {
 buttonClicked.setText("X");
 } else {

 buttonClicked.setText("O");
 }

 buttonClicked.setEnabled(false);
 isX = !isX;
  checkWin();
 }
