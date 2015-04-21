import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ExerciseGridLayout extends JFrame {
	private JFrame frame;
	private JTextField textbox [] = new JTextField[4];
	private JPanel panel = new JPanel();
	public ExerciseGridLayout() {
		
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(new GridLayout(2,2));
		
		textbox[0] = new JTextField(5);
		textbox[1] = new JTextField(5);
		textbox[2] = new JTextField(5);
		textbox[3] = new JTextField(5);
		
		panel.add (textbox[0]);
		panel.add (textbox[1]);
		panel.add (textbox[2]);
		panel.add (textbox[3]);
		frame.add (panel);
	}
}