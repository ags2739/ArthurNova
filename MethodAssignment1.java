import java.util.Scanner;


public class MethodAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		double x, y, z;
		System.out.println ("Enter a value for X.");
		x = keyboard.nextDouble();
		System.out.println ("Enter a value for Y.");
		y = keyboard.nextDouble();
		System.out.println ("Enter a value for Z.");
		z = keyboard.nextDouble();
		
		output(h(x));
		output(f(x,y));
		output(g(x,y,z));
	}
	public static void output(double x) {
		System.out.println(x);
	}
	
	public static double h (double x) {
		return Math.pow(x, 10);
	}
	
	public static double f (double x, double y) {
		return (x + y);
	}
	
	public static double g (double x, double y, double z) {
		return Math.sqrt(x) + Math.abs(y) + Math.pow(z, y);
	}
	
}
