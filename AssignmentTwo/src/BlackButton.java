import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BlackButton extends JButton {
	public static final long serialVersionUID = 1;

	public BlackButton(){
		this.setOpaque(true);
		this.setMinimumSize(new Dimension(30, 25));
		this.setPreferredSize(new Dimension(30, 25));

	    Border b = new LineBorder(Color.BLACK, 2);
		this.setBorder(b);		
	}

}
