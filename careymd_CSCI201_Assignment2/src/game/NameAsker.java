package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class NameAsker {
	String name;
	public NameAsker(String s)
	{
		JFrame frame = new JFrame("s + Wins!");
		JLabel j = new JLabel(s);
		frame.add(j);
		name = JOptionPane.showInputDialog(frame, s + " Wins!\n" + "What's your name?");
		GameManager.winnerName = name;
  }
	public String getName(){return name;}
}
