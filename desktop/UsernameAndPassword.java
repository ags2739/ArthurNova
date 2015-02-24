/**
 * 
 * @author ags2739
 * Date: 2/24/15
 * Purpose: A program asking for a username and password from the user, and if the username and password match the check, then a login message
 * is displayed, otherwise, a login failed prompt will be shown to the user.
 */
import java.util.Scanner;
public class UsernameAndPassword{

	public static void main(String[] args) {
		
		String username = "JohnDoe", password = "admin", usernameInput, passwordInput;
		Scanner keyboard = new Scanner(System.in);
		System.out.println ("Enter your username.");
		usernameInput = keyboard.next();
		System.out.println ("Enter your password.");
		passwordInput = keyboard.next();
		
		if (usernameInput.equals(username) && (passwordInput.equals(password))) {
			System.out.println ("Welcome " + username + "!");
		}
		else {
			System.out.println ("Wrong username or password!");
		}
		keyboard.close();
	}
}