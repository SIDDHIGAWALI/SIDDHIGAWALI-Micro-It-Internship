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
 private void checkWin() {
 int[][] winCombinations = {
 {0, 1, 2}, {3, 4, 5}, {6, 7, 8},
 {0, 3, 6}, {1, 4, 7}, {2, 5, 8},
 {0, 4, 8}, {2, 4, 6}
 };

 for (int[] combination : winCombinations) {
 int a = combination[0];
 int b = combination[1];
 int c = combination[2];
 if(buttons[a].getText().equals(buttons[b].getText())&& 
buttons[a].getText().equals(buttons[c].getText())&& 
!buttons[a].getText().isEmpty()) {
 JOptionPane.showMessageDialog(this, buttons[a].getText() + " 
wins!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
 resetGame();
 return;
 }
 }
 boolean isDraw = true;
 for (JButton button : buttons) {
 if (button.getText().isEmpty()) {
 isDraw = false;
 break;
 }
 }
 if (isDraw) {
 JOptionPane.showMessageDialog(this, "It's a draw!", "Game Over", 
JOptionPane.INFORMATION_MESSAGE);
 resetGame();
 }
 }
 private void resetGame() {
 for (JButton button : buttons) {
 button.setText("");
 button.setEnabled(true);
 }

 isX = true;
 }

public static void main(String[] args) {
 TicTacToeGame t=new TicTacToeGame();
 }

}
