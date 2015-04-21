import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ExerciseFlowLayout extends JFrame {
	
	private JFrame frame;
	private JTextField textbox [] = new JTextField[4];
	private JPanel panel = new JPanel();
	public ExerciseFlowLayout() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(new FlowLayout());
		
		
		textbox[0] = new JTextField(5);
		textbox[1] = new JTextField(5);
		textbox[2] = new JTextField(5);
		textbox[3] = new JTextField(5);
		
		frame.add (panel);
		panel.add (textbox[0]);
		panel.add (textbox[1]);
		panel.add (textbox[2]);
		panel.add (textbox[3]);
	
		
	
		
		
		
	}
}
