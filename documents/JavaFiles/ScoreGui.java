/**
 * Date: 4/25/15
 * Purpose: To calculate the weighted average of the computer science class.
 * @author: Arthur Smith
 * Contact: ags2739@email.vccs.edu
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ScoreGui implements ActionListener {
	//initializes the frame, the text boxes, the labels and the button.
	private JFrame frame;
	private JTextField textbox[] = new JTextField[13];
	private JLabel label[] = new JLabel[19];
	private JButton calcButton = new JButton();

	double result[] = new double[4];
	double finalScore;
	
	//constructor for the ScoreGui object.
	/**
	 * Constructs a ScoreGui object to calculate the final score.
	 * 
	 */
	public ScoreGui() {
		//creates all the GUI elements.
		frame = new JFrame();
		frame.setSize(600, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(7,4));
		
		label[0] = new JLabel("Student Name");
		label[1] = new JLabel("Smith,");
		label[2] = new JLabel("Arthur");
		label[3] = new JLabel("");
		label[4] = new JLabel("");
		label[5] = new JLabel("Score");
		label[6] = new JLabel("Weight");
		label[7] = new JLabel("Total");
		label[8] = new JLabel("Assignments");
		label[9] = new JLabel("Midterm");
		label[10] = new JLabel("Final Project");
		label[11] = new JLabel("Final Exam");
		label[12] = new JLabel("Weighted Average");
		label[13] = new JLabel("");
		
		label[14] = new JLabel("-----");
		label[15] = new JLabel("-----");
		label[16] = new JLabel("-----");
		label[17] = new JLabel("-----");
		label[18] = new JLabel("-----");
		
		textbox[0] = new JTextField(5);
		textbox[1] = new JTextField(5);
		textbox[2] = new JTextField(5);
		textbox[3] = new JTextField(5);
		textbox[4] = new JTextField(5);
		textbox[5] = new JTextField(5);
		textbox[6] = new JTextField(5);
		textbox[7] = new JTextField(5);
		textbox[8] = new JTextField(5);
		textbox[9] = new JTextField(5);
		textbox[10] = new JTextField(5);
		textbox[11] = new JTextField(5);
		textbox[12] = new JTextField(5);
		
		calcButton = new JButton();
		calcButton.setText("Calculate");
		calcButton.addActionListener(this);
		
		//adds all the GUI elements to the program formatted correctly.
		frame.add(label[0]);
		frame.add(label[1]);
		frame.add(label[2]);
		frame.add(label[3]);
		frame.add(label[4]);
		frame.add(label[5]);
		frame.add(label[6]);
		frame.add(label[7]);
		frame.add(label[8]);
		frame.add(textbox[0]);
		frame.add(textbox[1]);
		frame.add(label[14]);
		frame.add(label[9]);
		frame.add(textbox[3]);
		frame.add(textbox[4]);
		frame.add(label[15]);
		frame.add(label[10]);
		frame.add(textbox[6]);
		frame.add(textbox[7]);
		frame.add(label[16]);
		frame.add(label[11]);
		frame.add(textbox[9]);
		frame.add(textbox[10]);
		frame.add(label[17]);
		frame.add(label[12]);
		frame.add(label[13]);
		frame.add(calcButton);
		frame.add(label[18]);
		
		
	}
	/**
	 * The method for calculating the average score of the class, considering all the weights and values inputed.
	 * @param score1
	 * @param score2
	 * @param score3
	 * @param score4
	 * @param weight1
	 * @param weight2
	 * @param weight3
	 * @param weight4
	 */
	public void calculateAvgScore(double score1, double score2, double score3, double score4, 
			double weight1, double weight2, double weight3, double weight4) 
	{
		this.result[0] = (score1 * weight1);
		this.result[1] = (score2 * weight2);
		this.result[2] = (score3 * weight3);
		this.result[3] = (score4 * weight4);
		this.finalScore = (this.result[0]+this.result[1]+this.result[2]+this.result[3]);
		
	}

	/**
	 * Performs the calculations when the button on the object is pressed.
	 */
	public void actionPerformed(ActionEvent e) {
		
		double score1 = Double.parseDouble(textbox[0].getText());
		double weight1 = Double.parseDouble(textbox[1].getText());
		
		double score2 = Double.parseDouble(textbox[3].getText());
		double weight2 = Double.parseDouble(textbox[4].getText());
		
		double score3 = Double.parseDouble(textbox[6].getText());
		double weight3 = Double.parseDouble(textbox[7].getText());
		
		double score4 = Double.parseDouble(textbox[9].getText());
		double weight4 = Double.parseDouble(textbox[10].getText());
		
		calculateAvgScore(score1, score2, score3, score4, weight1, weight2, weight3, weight4);
		
		label[14].setText(String.valueOf(this.result[0]));
		label[15].setText(String.valueOf(this.result[1]));
		label[16].setText(String.valueOf(this.result[2]));
		label[17].setText(String.valueOf(this.result[3]));
		label[18].setText(String.valueOf(this.finalScore));
		
	}

	
}

