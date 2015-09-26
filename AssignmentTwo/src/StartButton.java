import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class StartButton extends JButton{
	public static final long serialVersionUID = 1;

	/* 0 = yellow
	 * 1 = green
	 * 2 = red
	 * 3 = blue
	 */
	
	public StartButton(int color){
		
		super("Start");
		this.setOpaque(true);
		 this.setMinimumSize(new Dimension(40, 30));
		    this.setMaximumSize(new Dimension(40, 30));
	    
	    switch(color){
	    case 0:
	    	this.setBackground(Color.YELLOW);
	    	break;
	    case 1:
	    	this.setBackground(Color.GREEN);
	    	break;
	    case 2:
	    	this.setBackground(Color.RED);
	    	break;
	    case 3:
	    	this.setBackground(Color.BLUE);
	    }
	}
}
