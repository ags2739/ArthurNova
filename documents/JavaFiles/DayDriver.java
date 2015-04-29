import java.util.Scanner;
public class DayDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int daysAdded;
		int currentDay;
		Day day = new Day("Mon");
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the day of the week: Mon=0, Tue=1, Wed=2, Thu=3, Fri=4, Sat=5, or Sun=6.");
		currentDay = keyboard.nextInt();
		day.setDay(day.days[currentDay]);
		
		day.setDay(day.days[currentDay-1]);
		System.out.println("Yesterday: " + day);
		
		day.setDay(day.days[currentDay+1]);
		System.out.println("Tomorrow: " + day);
		
		day.setDay(day.days[currentDay]);
		System.out.println("Today: " + day);
		
		System.out.println("Enter the number of days to add.");
		daysAdded = keyboard.nextInt();
		
		day.calculateDay(daysAdded, currentDay);
		
		System.out.println("Current " + day);
		
		
		
		
		
		
	}

}
