
public class CarDriver {

	public static void main(String[] args) {
		//creates a generic car and changes the color, then retrieves the color.
		Car car1 = new Car();
		System.out.println(car1.toString());
		car1.setColor("red");
		car1.setHorsePower(300);
		car1.setEngineSize("V4");
		car1.setMaker("Benefactor Cars");
		
		System.out.println(car1.getColor());
		System.out.println(car1.getHorsePower());
		System.out.println(car1.getEngineSize());
		System.out.println(car1.getMaker());
		System.out.println(car1.toString() + "\n");
		
		
		//creates a custom car and changes the attributes, then returns them, then displays the final output
		Car car2 = new Car ("yellow", 300, "V10", "Example Autos");
		System.out.println (car2.toString());
		car2.setColor("purple");
		car2.setHorsePower(500);
		car2.setEngineSize("V10");
		car2.setMaker("Free Motors");
		
		System.out.println(car2.getColor());
		System.out.println(car2.getHorsePower());
		System.out.println(car2.getEngineSize());
		System.out.println(car2.getMaker());
		System.out.println(car2.toString() + "\n");

		
		Car car3 = new Car ("black", 800, "V12", "Smith Automobiles");
		System.out.println(car3.toString());
		car3.setColor("dark grey");
		car3.setEngineSize("V16");
		car3.setHorsePower(900);
		car3.setMaker("Fine Autos");
		
		System.out.println(car3.getColor());
		System.out.println(car3.getHorsePower());
		System.out.println(car3.getEngineSize());
		System.out.println(car3.getMaker());
		System.out.println(car3.toString());
	}

}
