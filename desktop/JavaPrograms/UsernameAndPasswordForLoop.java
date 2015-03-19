import java.util.Scanner;


public class UsernameAndPasswordForLoop {

	public static void main(String[] args) {
		String username = "JohnDoe", password = "admin", usernameInput= "", passwordInput="";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your username and password.");
		for (int i = 0; i <3; i++) {
			System.out.println("Please enter your username: ");
			usernameInput = keyboard.next();
			System.out.println("Please enter your password:");
			passwordInput = keyboard.next();
			
			if (usernameInput.equals(username)&&passwordInput.equals(password)) {
				System.out.println ("Welcome "+ username + "!");
				break;
			}
		}
		if (!usernameInput.equals(username)&&!passwordInput.equalsIgnoreCase(password)){
		System.out.println ("Please contact your administrator to unlock your account.");
		}
	}

}
