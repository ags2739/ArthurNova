import java.util.Scanner;
public class UsernameAndPasswordWhileLoop {

	public static void main(String[] args) {
		String username = "JohnDoe", password = "admin", usernameInput= "", passwordInput="";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your username and password.");
		while (!usernameInput.equals (username)&&(!passwordInput.equals (password))) {
			System.out.println ("Please enter your username: ");
			usernameInput = keyboard.next();
			System.out.println ("Please enter your password: ");
			passwordInput = keyboard.next();
			
		}
	
		System.out.println("Welcome " + username + "!");

	}

}
