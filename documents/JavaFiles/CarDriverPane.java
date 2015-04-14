import javax.swing.JOptionPane;


public class CarDriverPane {
	
	public static void main(String[] args) {
		String inputColor;
		String inputMaker;
		double inputHP;
		String inputEngine;
		
		Car car1 = new Car();
		inputColor = JOptionPane.showInputDialog(null, "Enter a color for the car.");
		car1.setColor(inputColor);
		inputHP = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the horsepower of the car."));
		car1.setHorsePower(inputHP);
		inputEngine = JOptionPane.showInputDialog(null, "Enter the engine size of the car.");
		car1.setEngineSize(inputEngine);
		inputMaker = JOptionPane.showInputDialog(null, "Enter the maker of the car.");
		car1.setMaker(inputMaker);
		JOptionPane.showMessageDialog(null, car1);
		
		Car car2 = new Car();
		inputColor = JOptionPane.showInputDialog(null, "Enter a color for the car.");
		car2.setColor(inputColor);
		inputHP = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the horsepower of the car."));
		car2.setHorsePower(inputHP);
		inputEngine = JOptionPane.showInputDialog(null, "Enter the engine size of the car.");
		car2.setEngineSize(inputEngine);
		inputMaker = JOptionPane.showInputDialog(null, "Enter the maker of the car.");
		car2.setMaker(inputMaker);
		JOptionPane.showMessageDialog(null, car2);
		
		Car car3 = new Car();
		inputColor = JOptionPane.showInputDialog(null, "Enter a color for the car.");
		car3.setColor(inputColor);
		inputHP = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the horsepower of the car."));
		car3.setHorsePower(inputHP);
		inputEngine = JOptionPane.showInputDialog(null, "Enter the engine size of the car.");
		car3.setEngineSize(inputEngine);
		inputMaker = JOptionPane.showInputDialog(null, "Enter the maker of the car.");
		car3.setMaker(inputMaker);
		JOptionPane.showMessageDialog(null, car3);
		
		Car car4 = new Car();
		//inputColor = JOptionPane.showInputDialog(null, "Enter a color for the car.");
		car4.setColor(inputColor);
		//inputHP = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the horsepower of the car."));
		car4.setHorsePower(inputHP);
		//inputEngine = JOptionPane.showInputDialog(null, "Enter the engine size of the car.");
		car4.setEngineSize(inputEngine);
		//inputMaker = JOptionPane.showInputDialog(null, "Enter the maker of the car.");
		car4.setMaker(inputMaker);
		JOptionPane.showMessageDialog(null, car4);
		
		JOptionPane.showMessageDialog(null, "Are cars 3 and 4 equal:" + car4.equals(car3));

	}

}
