
public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 1;
		String starLine = "*";
		
		while (lines < 6) {
			
			switch (lines) {
			case 1: case 5:
				starLine = "*";
				break;
			case 2: case 4:
				starLine = " ***";
				break;
			case 3:
				starLine = "*****";
				break;
			}
		System.out.printf ("\n %3s",starLine);
		lines++;
		}
		
	}

}
