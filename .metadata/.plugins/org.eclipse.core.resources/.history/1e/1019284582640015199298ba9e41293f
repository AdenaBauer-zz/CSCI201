import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class gameManager{
	public static final long serialVersionUID = 1;
		
	JPanel gamePanel;
	GridBagConstraints gbc = new GridBagConstraints();
	
	/* 0 = yellow
	 * 1 = green
	 * 2 = red
	 * 3 = blue
	 */
	//x and y pos in the slide signify where the slide starts
	public void MakeSlide(int slideLen, int slideColor, int xpos, int ypos){
		
	}
	
	public void createYellow(){
		BlackButton b = new BlackButton();
		gbc.gridx = 0; 
		gbc.gridy = 0;
		gamePanel.add(b);
		
		MakeSlide(4, 0, 1, 0);
		for(int i = 0; i < 4; i++){
			BlackButton b1 = new BlackButton();
			gbc.gridx = 5+i;
			gamePanel.add(b1);
		}
		MakeSlide(5, 0, 9, 0);

	}
	
	public void createBoard(){
		
		createYellow(); //creating yellow side
		
	
	}
	
	public gameManager(JPanel p){
		gamePanel = p;
		gamePanel.setLayout(new GridBagLayout());
		createBoard();
		
	}

}

/*
LETS THINK ABOUT THE BOARD:
starts w/back
then 4 colored slide pieces
- the 2nd of these has 6 coming off of it. the last being "home"
- the 4th of these has one coming off of it, being "start"
then 4 black
then 5 colored slide pieces
then 1 black

TYPES OF BUTTONS:
start
home base, leading to home
slide
black

*/


