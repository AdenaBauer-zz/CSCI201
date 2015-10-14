package game;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import game.TopScore;


public class scoreTable extends JFrame{

	private static final long serialVersionUID = 1L;
	public Map<String, Integer> playerScores;

	public scoreTable() {
		super("Table Example");
		
		playerScores = new HashMap<String, Integer>();

		JPanel jp = new JPanel();
		String [] columnNames = {"Name", "Score"};
		Object [][] data = {
				
		};
		
		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

		JTable tables = new JTable(data, columnNames);
		tables.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tables.setSelectionForeground(Color.WHITE);
		tables.setSelectionBackground(Color.RED);
		
		if(!playerScores.isEmpty()){
			for (Entry<String, Integer> entry : playerScores.entrySet()){
				String currName = entry.getKey();
				int currScore = entry.getValue();
				tableModel.addRow(new Object[]{currName, currScore});
			}	
		}

		tables.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tables.setGridColor(Color.BLUE);
		JScrollPane jsp = new JScrollPane(tables);
		add(jsp);
		
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(250, 300);
		setLocationRelativeTo(null);
	}
	public void makeScore(){
		int score = 0;
		for(int i = 0; i < GameManager.numRealPlayers; i++){
			int pawnsHome = GameManager.numPawnsHome[i];
			if(i != 0){
				score = score + (4-pawnsHome)*3;
			}
			if(i == 0){
			score = score + pawnsHome*5;
			}
		}
		GameManager.winnerScore = score;
		
	}
	public void addScore(String name){
		playerScores.put(name, GameManager.winnerScore);
	}
	
}
