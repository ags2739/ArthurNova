import javax.swing.JOptionPane;

public class Assignment3Part2 {

	public enum AccountType {Administrator, Staff, Student};
	public static void main(String[] args) {
		boolean logon = false;
		String usernameAdmin = "JohnAdmin", usernameStaff = "JohnStaff", usernameStudent= "JohnStudent", passwordAdmin = "admin", passwordStaff = "stafflogon", 
				passwordStudent = "Doe1134", usernameInput, passwordInput;
		AccountType [] choices = {AccountType.Administrator, AccountType.Staff, AccountType.Student};
		
		while (logon == false) {
		
			AccountType input = (AccountType)JOptionPane.showInputDialog
				(null, "Select your account type.", "Account Type", JOptionPane.QUESTION_MESSAGE, null, choices, choices [0]);
			switch (input) {
			
			//Case statement for Administrator option
			
			case Administrator:
				usernameInput = JOptionPane.showInputDialog(null, "Enter your username.");
				if (usernameInput.equals(usernameAdmin)) {
					passwordInput = JOptionPane.showInputDialog(null, "Enter your password.");
					if (passwordInput.equals(passwordAdmin)) {
						JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
						System.exit(0);}
					else { 
						JOptionPane.showMessageDialog(null, "Incorrect password. Please select your account type again.");
						break;
						}
						}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect username. Please select your account type again.");
					break;
					}
				break;
			//Case statement for Staff option
				
			case Staff:
				usernameInput = JOptionPane.showInputDialog(null, "Enter your username.");
				if (usernameInput.equals(usernameStaff)) {
					passwordInput = JOptionPane.showInputDialog(null, "Enter your password.");
					if (passwordInput.equals(passwordStaff)) {
						JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
						System.exit(0);}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect password. Please select your account type again.");
						break;
						}
						}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Username. Please select your account type again.");
					break;
				}
				break;
				
			//Case statement for Student option
				
			case Student:
				usernameInput = JOptionPane.showInputDialog(null, "Enter your username.");
				if (usernameInput.equals(usernameStudent)) {
					passwordInput = JOptionPane.showInputDialog(null, "Enter your password.");
					if (passwordInput.equals(passwordStudent)) {
						JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
						System.exit(0);}
					else {
						JOptionPane.showMessageDialog(null, "Incorrect password. Please select your account type again.");
						break;
						
						}
						}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect username. Please select your account type again.");
					break;
				}
				break;
				
			}					
		}			
	}
}