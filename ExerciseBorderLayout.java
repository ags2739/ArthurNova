import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExerciseBorderLayout extends JFrame {
	
	private JFrame frame;
	private JTextField textbox [] = new JTextField[4];
	private JPanel panel = new JPanel();
	public ExerciseBorderLayout() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(new BorderLayout());
		
		textbox[0] = new JTextField(5);
		textbox[1] = new JTextField(5);
		textbox[2] = new JTextField(5);
		textbox[3] = new JTextField(5);
		
		
		panel.add (textbox[0], BorderLayout.PAGE_START);
		panel.add (textbox[1], BorderLayout.LINE_START);
		panel.add (textbox[2], BorderLayout.LINE_END);
		panel.add (textbox[3], BorderLayout.PAGE_END);
		frame.add(panel);
		
	}
}

