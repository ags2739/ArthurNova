
public class Calculator {

	public static double getAverage(double [] number) {
		double sum = 0;
		for (int i=0; i<number.length; i++) {
			sum = sum + number[i];
		}
		return sum/number.length;
	}
	
	public static double getSum(double [] number) {
		double sum = 0;
		for (int i=0; i<number.length; i++) {
			sum = sum + number[i];
		}
		return sum;
	}
	
	public static double getProduct(double [] number) {
		
		return number[0]*number[1]*number[2];
	}
	
	public static double getAverage(int [] number) {
		int sum = 0;
		for (int i=0; i<number.length; i++) {
			sum = sum + number[i];
		}
		return sum/number.length;
	}
	
	public static double getSum(int [] number) {
		int sum = 0;
		for (int i=0; i<number.length; i++) {
			sum = sum + number[i];
		}
		return sum;
	}
	
	public static double getProduct(int [] number) {
		
		return number[0]*number[1]*number[2];
	}
}
