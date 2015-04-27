import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SortingGui implements ActionListener{
	private JFrame frame;
	private JLabel output [] = new JLabel[10];
	private JLabel instructions;
	private JTextField input [] = new JTextField[10];
	private JButton calcButton;
	int [] unsortedList = new int [10];
	
	public SortingGui() 
	{
		
		frame=new JFrame();
		frame.setSize(1200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2,11));
		
		instructions = new JLabel();
		instructions.setText("Enter ten integers.");
		output[0] = new JLabel();
		output[1] = new JLabel();
		output[2] = new JLabel();
		output[3] = new JLabel();
		output[4] = new JLabel();
		output[5] = new JLabel();
		output[6] = new JLabel();
		output[7] = new JLabel();
		output[8] = new JLabel();
		output[9] = new JLabel();
		output[0].setText("-");
		output[1].setText("-");
		output[2].setText("-");
		output[3].setText("-");
		output[4].setText("-");
		output[5].setText("-");
		output[6].setText("-");
		output[7].setText("-");
		output[8].setText("-");
		output[9].setText("-");
		input[0] = new JTextField();
		input[1] = new JTextField();
		input[2] = new JTextField();
		input[3] = new JTextField();
		input[4] = new JTextField();
		input[5] = new JTextField();
		input[6] = new JTextField();
		input[7] = new JTextField();
		input[8] = new JTextField();
		input[9] = new JTextField();
		calcButton = new JButton();
		calcButton.setText("Calculate");
		calcButton.addActionListener(this);
		frame.add(instructions);
		frame.add(input[0]);
		frame.add(input[1]);
		frame.add(input[2]);
		frame.add(input[3]);
		frame.add(input[4]);
		frame.add(input[5]);
		frame.add(input[6]);
		frame.add(input[7]);
		frame.add(input[8]);
		frame.add(input[9]);
		frame.add(calcButton);
		frame.add(output[0]);
		frame.add(output[1]);
		frame.add(output[2]);
		frame.add(output[3]);
		frame.add(output[4]);
		frame.add(output[5]);
		frame.add(output[6]);
		frame.add(output[7]);
		frame.add(output[8]);
		frame.add(output[9]);
	}
	
	public static int [] sortedList(int [] numberList) {
		for (int i=0; i<numberList.length; i++)
			for(int j=1; j<numberList.length; j++ )
				if (numberList[i]>numberList[j])
					swap (numberList, i, j);
		
		return numberList;
	}
	
	private static void swap(int[] numberList, int i, int j) {
		
		int temp = numberList[i];
		numberList[i] = numberList[j];
		numberList[j] = temp;
		
	}

	public void actionPerformed(ActionEvent e) {
		unsortedList[0] = Integer.parseInt(input[0].getText());
		unsortedList[1] = Integer.parseInt(input[1].getText());
		unsortedList[2] = Integer.parseInt(input[2].getText());
		unsortedList[3] = Integer.parseInt(input[3].getText());
		unsortedList[4] = Integer.parseInt(input[4].getText());
		unsortedList[5] = Integer.parseInt(input[5].getText());
		unsortedList[6] = Integer.parseInt(input[6].getText());
		unsortedList[7] = Integer.parseInt(input[7].getText());
		unsortedList[8] = Integer.parseInt(input[8].getText());
		unsortedList[9] = Integer.parseInt(input[9].getText());
		
		
		int [] sortedList = sortedList(unsortedList);
		
		output[0].setText(String.valueOf(sortedList[0]));
		output[1].setText(String.valueOf(sortedList[1]));
		output[2].setText(String.valueOf(sortedList[2]));
		output[3].setText(String.valueOf(sortedList[3]));
		output[4].setText(String.valueOf(sortedList[4]));
		output[5].setText(String.valueOf(sortedList[5]));
		output[6].setText(String.valueOf(sortedList[6]));
		output[7].setText(String.valueOf(sortedList[7]));
		output[8].setText(String.valueOf(sortedList[8]));
		output[9].setText(String.valueOf(sortedList[9]));
	}
	
}
