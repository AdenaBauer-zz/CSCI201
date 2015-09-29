import javax.swing.JButton;

public class Tiles {
	
	static JButton[] boardLoop;
	static JButton[] startButtons; 
	static int [] loopColors;
	static JButton [][] homeBaseButtons;
	int counter; 
	int homeButtonCounter [];
	
	/*
	 * yellow = 0
	 * green = 1
	 * red = 2
	 * blue = 3
	 * black = 4
	 */
		
	public Tiles(){
		boardLoop = new JButton[60];
		loopColors = new int[60];
		startButtons = new JButton[4];
		homeBaseButtons = new JButton[4][6];
		homeButtonCounter = new int[4];
		counter = 0; 
	}
	
	public void addTilesToLoop(JButton b, int color){
		
		boardLoop[counter] = b;
		loopColors[counter] = color;	
		counter = counter + 1;
	}
	public void addTilesToStart(JButton b, int color){
		
		startButtons[color] = b;
	}
	public void addTilesToHome(JButton b, int color){
		homeBaseButtons[color][homeButtonCounter[color]] = b;		
		homeButtonCounter[color] = homeButtonCounter[color] + 1;	
	}
	
}

