import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		
		double height, width, perimeter, area;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println ("Enter the height and width of a rectangle.\n");
		height = keyboard.nextDouble();
		width = keyboard.nextDouble();
		
		perimeter = ((height * 2) + (width * 2));
		area = (height * width);
		
		System.out.println("The perimeter is: " + perimeter);
		System.out.println("The area is: " + area);
		
		keyboard.close();
		
	}

}