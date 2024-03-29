import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class LayoutManagerDemo extends JFrame{
	public static final long serialVersionUID = 1;
	private JTabbedPane jtp;
	private JPanel borderPanel, flowPanel;
	
	public LayoutManagerDemo(){
		super("Layout Manager Demo");
		initializeComponents();
		createGUI();
		addEvents();
	}
	
	private void initializeComponents(){
		jtp = new JTabbedPane();
		borderPanel = getBorderPanelTab();
		flowPanel = getFlowPanelTab();
	}
	private void createGUI(){
		setSize(300,400);
		setLocation(700,100);
		jtp.add("BorderLayout", borderPanel);
		jtp.addChangeListener("FlowLayout", flowPanel);
		add(jtp, BorderLayout.CENTER);
	}
	private void addEvents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private JPanel getFlowPanelTab(){
		JPanel
	}
	
	private JPanel getBorderPanelTab(){
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		JTextField jtf1 = new JTextField ("this is the north");
		JTextField jtf2 = new JTextField ("this is south");
		JButton jb = new JButton("center button");
		jp.add(jtf1, BorderLayout.NORTH);
		jp.add(jtf2, BorderLayout.SOUTH);
		jp.add(jb, BorderLayout.CENTER);
		
		return jp;
	}
	
	public static void main(String [] args){
		LayoutManagerDemo lmd = new LayoutManagerDemo();
		lmd.setVisible(true);
	}
	
}
