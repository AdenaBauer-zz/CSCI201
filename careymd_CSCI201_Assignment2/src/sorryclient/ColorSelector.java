package sorryclient;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/*
 * ColorSelector
 * Menu to select Red,Blue,Green,Yellow
 * */
public class ColorSelector extends JPanel {
	
	private static final long serialVersionUID = 1900724217285760485L;
	
	//The options for color selection
	private Color selection;
	private final int numOptions = 4;
	private final JButton[] optionButtons;
	
	private final JButton confirmButton;
	BufferedImage buttonIcon;
	
	private final static String selectColorString = "Select your color";
	
	private final static String[] colorNames = {"Red", "Blue", "Green", "Yellow"};
	private final static Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
	
	//For spacing to the borders
	private final static Insets spacing = new Insets(20,20,20,20);
	
	public Color getPlayerColor() {
		return selection;
	}
	
	public ColorSelector(ActionListener confirmAction) {
		//font
		Font font = new Font("Calibri", Font.BOLD, 14);
	    try{
			font = Font.createFont(Font.TRUETYPE_FONT, new File("src/imgs/kenvector_future.ttf")).deriveFont(Font.PLAIN, 20);;
		}
		catch(Exception e){
			System.out.print("font error thrown");
		}
		
		//set up the button so we can proceed
	    BufferedImage [] colorButtonIcons = new BufferedImage[4];
		try{
			buttonIcon = ImageIO.read(new File("src/imgs/grey_button00.png"));   
			colorButtonIcons[0] = ImageIO.read(new File("src/imgs/red_button00.png"));
			colorButtonIcons[1] = ImageIO.read(new File("src/imgs/blue_button00.png"));
			colorButtonIcons[2] = ImageIO.read(new File("src/imgs/green_button00.png"));
			colorButtonIcons[3] = ImageIO.read(new File("src/imgs/yellow_button00.png"));

		}
		catch(Exception e){
			System.out.print("button image threw exception");
		}
		
		confirmButton = new JButton(new ImageIcon(buttonIcon));
		confirmButton.setText("Confirm");
		confirmButton.setHorizontalTextPosition(JButton.CENTER);
		confirmButton.setVerticalTextPosition(JButton.CENTER);
		confirmButton.setBorderPainted(false);
	    
	    confirmButton.addActionListener(confirmAction);
		confirmButton.setEnabled(false);
		confirmButton.setFont(font);
		
		//cursor
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	    Image image = toolkit.getImage("src/imgs/cursorHand_grey.png");
	    Cursor c = toolkit.createCustomCursor(image , new Point(this.getX(), 
	    this.getY()), "img");
	    this.setCursor (c);
		
		//The top of the panel, the label
		JLabel selectPlayerLabel = new JLabel(selectColorString);
		selectPlayerLabel.setFont(font);
		
		JPanel topPanel = new JPanel();
		topPanel.add(selectPlayerLabel);
		
		//The middle of the panel, the color buttons
		JPanel centerPanel = new JPanel(new GridLayout(2,2,20,20));
		optionButtons = new JButton[numOptions];
		for(int i = 0; i < numOptions; ++i) {
			optionButtons[i] = new JButton(new ImageIcon(colorButtonIcons[i]));
			optionButtons[i].setText(colorNames[i]);
			optionButtons[i].setHorizontalTextPosition(JButton.CENTER);
			optionButtons[i].setVerticalTextPosition(JButton.CENTER);
			optionButtons[i].setBorderPainted(false);
			final int buttonSelection = i;
			optionButtons[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent ae) {
					selection = colors[buttonSelection];
					for(JButton button : optionButtons) button.setEnabled(true);
					optionButtons[buttonSelection].setEnabled(false);
					confirmButton.setEnabled(true);
				}
			});
			optionButtons[i].setFont(font);
			centerPanel.add(optionButtons[i]);
		}
		centerPanel.setBorder(new EmptyBorder(spacing));
		
		//The bottom of the panel, the confirm button
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel,BoxLayout.X_AXIS));
		bottomPanel.setBorder(new EmptyBorder(spacing));
		bottomPanel.add(Box.createGlue());
		bottomPanel.add(confirmButton);
		
		setLayout(new BorderLayout());
		
		add(topPanel, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
	}

}
