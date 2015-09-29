import javax.swing.JButton;

public class Player {
	int playerColor;
	JButton[] currentSpaces;
	boolean playerWon;
	
	public Player(int color){
		playerColor = color;
		currentSpaces = new JButton [4];
		playerWon = false;
	}
	
	public void goToStart(int pon){
		currentSpaces[pon] = Tiles.startButtons[playerColor];
	}
	
	
}
