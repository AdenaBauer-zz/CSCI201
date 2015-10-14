package game;

import java.awt.Color;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;

/*
 * GameHelpers
 * Various methods for translation
 * */
public class GameHelpers {
	private static final Color colors[] = {Color.RED, Color.BLUE, Color.YELLOW, Color.GREEN};
	
	private static final Map<String,Color> colorLookup = new HashMap<String,Color>();
	private static final Map<Color,String> slideLabelLookup = new HashMap<Color,String>();
	private static final Map<Color,Integer> colorIndexLookup = new HashMap<Color,Integer>();
	private static final Map<Integer, String> indexImageLookup = new HashMap <Integer, String>();
	private static final Map<Color, String> homeStartLabelLookup = new HashMap <Color, String>();

	
	static {
		colorLookup.put("-", Color.BLACK);
		colorLookup.put("r", colors[0]);
		colorLookup.put("b", colors[1]);
		colorLookup.put("y", colors[2]);
		colorLookup.put("g", colors[3]);

		slideLabelLookup.put(colors[0], "src/imgs/red_slide.png");
		slideLabelLookup.put(colors[1], "src/imgs/blue_slide.png");
		slideLabelLookup.put(colors[2], "src/imgs/yellow_slide.png");
		slideLabelLookup.put(colors[3], "src/imgs/green_slide.png");
		
		colorIndexLookup.put(colors[0], 0);
		colorIndexLookup.put(colors[1], 1);
		colorIndexLookup.put(colors[2], 2);
		colorIndexLookup.put(colors[3], 3);
		
		indexImageLookup.put(0, "src/imgs/red_panel.png");
		indexImageLookup.put(1, "src/imgs/blue_panel.png");
		indexImageLookup.put(2, "src/imgs/yellow_panel.png");
		indexImageLookup.put(3, "src/imgs/green_panelpng");
		
		homeStartLabelLookup.put(colors[0], "src/imgs/red_panel.png");
		homeStartLabelLookup.put(colors[1], "src/imgs/blue_panel.png");
		homeStartLabelLookup.put(colors[2], "src/imgs/yellow_panel.png");
		homeStartLabelLookup.put(colors[3], "src/imgs/green_panel.png");	
	}

	public static Color getColorFromIndex(int index) {
		return colors[index];
	}
	public static String getIconFromIndex(int index){
		return indexImageLookup.get(index);
	}
	
	public static Integer getIndexFromColor(Color color) {
		return colorIndexLookup.get(color);
	}
	public static String getStartHomeLabelFromIndex(Color c){
		System.out.println(c.toString());
		System.out.println(homeStartLabelLookup.get(c));
		return homeStartLabelLookup.get(c);
	}
	
	public static Color getColorFromString(String color) {
		return colorLookup.get(color);
	}
	
	public static String getSlideLabelFromColor(Color color) {
		return slideLabelLookup.get(color);
	}

}
