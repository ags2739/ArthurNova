import javax.swing.JOptionPane;

public class Assignment3Part1 {

	public static void main(String[] args) {
		String username = "JohnDoe", password = "admin", userInput = " ", passInput = " ";
		int tries = 0;
		
		
		JOptionPane.showMessageDialog(null, "Click OK to sign on.");
		
		while (username != userInput) {
			userInput = JOptionPane.showInputDialog(null, "Enter your username.");
			if (username.equals(userInput)) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect Username.");
			}
			
		}
		while (passInput != password) {
			
		passInput = JOptionPane.showInputDialog(null, "Enter your password.");
			if (password.equals(passInput)) {
				JOptionPane.showMessageDialog(null, "Welcome " + username + "!");
				break;
			} else {
				tries = tries + 1;
				JOptionPane.showMessageDialog(null, "Incorrect Password. Failed attempts: " + tries + ". Three failed attempts will result in a locked account.");
				
				
			} if (tries == 3) {
				JOptionPane.showMessageDialog(null, "Please contact your administrator.");
				break;
			}
		}
	}
}