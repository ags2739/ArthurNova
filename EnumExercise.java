import javax.swing.JOptionPane;

public class EnumExercise {
	
	public enum month {January, February, March, April, May, June, July, August, September, October, November, December, placeholder};

	public static void main(String[] args) {		
		
		month [] choices = {month.January, month.February, month.March, month.April, 
				month.May, month.June, month.July, month.August, month.September, month.October, month.November, month.December};
		month selectedMonth = month.placeholder;
		
		
		
		while (selectedMonth != null) {
			
			selectedMonth = (month)JOptionPane.showInputDialog
					(null, "Select a month.", "Months", JOptionPane.QUESTION_MESSAGE, null, choices, choices [0]);
			
			
			switch (selectedMonth) {
			case December: case January: case February:
				JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
				break;
			case March: case April: case May:
				JOptionPane.showMessageDialog(null, "Happy Spring days!");
				break;
			case June: case July: case August:
				JOptionPane.showMessageDialog(null, "It's a summer time.");
				break;
			case September: case October: case November:
				JOptionPane.showMessageDialog (null, "Welcome to the foliage season!");
				break;
			default:
				JOptionPane.showMessageDialog (null, "Goodbye.");
				break;
			
			
			}
		}

	}
}