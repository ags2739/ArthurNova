import java.util.Scanner;

public class FacultySwitch {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		//prompts the user to enter their position in the database
		System.out.println ("Enter your position: Administrator, Faculty, Staff, Student, Guest");
		String username = keyboard.next();
		//establishes the different cases for the possibilities of the 
		//output
		switch (username) {
		case "Administrator": case "administrator":
			System.out.println ("Welcome " + username + "!");
			break;
		case "Faculty": case "faculty":
			System.out.println ("Welcome " + username + "!");
			break;
		case "Staff": case "staff":
			System.out.println ("Welcome " + username + "!");
			break;
		case "Student": case "student":
			System.out.println ("Welcome " + username + "!");
			break;
		case "Guest": case "guest":
			System.out.println ("Welcome " + username + "!");
			break;
		default:
			System.out.println ("Unrecognized position.");
			break;
		}
		

	}

}
