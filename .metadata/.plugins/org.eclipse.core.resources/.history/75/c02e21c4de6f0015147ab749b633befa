package sorryclient;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * MainMenu
 * Menu to hold the start button
 * */
public class MainMenu extends JPanel{
	private static final long serialVersionUID = 3609831945869059312L;
	
	private final JButton start;
	private final String menuTitleString = "Sorry!";
	BufferedImage buttonIcon;
	
	public MainMenu(ActionListener startAction){
		
		try{
			buttonIcon = ImageIO.read(new File("src/imgs/grey_button00.png"));    
		}
		catch(Exception e){
			System.out.print("button image threw exception");
		}
		
		start = new JButton(new ImageIcon(buttonIcon));
		start.setText("START");
	    start.addActionListener(startAction);
	    start.setHorizontalTextPosition(JButton.CENTER);
	    start.setVerticalTextPosition(JButton.CENTER);
	    start.setBorderPainted(false);

	    Toolkit toolkit = Toolkit.getDefaultToolkit();
	    Image image = toolkit.getImage("src/imgs/cursorHand_grey.png");
	    Cursor c = toolkit.createCustomCursor(image , new Point(this.getX(), 
	    this.getY()), "img");
	    this.setCursor (c);
	    
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagLayout gblayout = new GridBagLayout();
		try{
			Font font = Font.createFont(Font.TRUETYPE_FONT, new File("src/imgs/kenvector_future.ttf")).deriveFont(Font.PLAIN, 14);
			start.setFont(font);
		}
		catch(Exception e){
			System.out.print("font error thrown");
		}
				
		setLayout(gblayout);		
		ImageIcon icon = new ImageIcon("src/imgs/sorry.png");

		JLabel sorryPic = new JLabel();
		sorryPic.setIcon(icon);
		add(sorryPic, gbc);
		gbc.gridy = 4;
		add(start,gbc);				
	}
	
}
