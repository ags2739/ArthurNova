/**
 * Purpose: A class for all the days in the week.
 * Date: 4/29/2015
 * Contact: ags2739@email.vccs.edu
 * @author Arthur Smith
 *
 */
public class Day {
	private String day;
	String [] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	
	
	/**
	 * Constructs the Day object.
	 * @param day
	 */
	public Day (String day) {
		super();
		this.day = day;
	}
	
	/**
	 * Gets the day. 
	 * @return day
	 */
	public String getDay() {
		return day;
	}
	
	/**
	 * Sets the day.
	 * @param day
	 */
	public void setDay(String day) {
		this.day = day;
	}
	
	/**
	 * A method for changing the day based on input.
	 * @param numOfDays
	 * @param currentDay
	 */
	public void calculateDay(int numOfDays, int currentDay) {
		
		
		int i = (currentDay + numOfDays);
		
		while (i > 7) {
			i = i - 7;
		}
		switch (i) {
		
		case 0:
			setDay("Mon");
			break;
		case 1:
			setDay("Tue");
			break;
		case 2:
			setDay("Wed");
			break;
		case 3:
			setDay("Thu");
			break;
		case 4:
			setDay("Fri");
			break;
		case 5:
			setDay("Sat");
			break;
		case 6:
			setDay("Sun");
			break;
		}
		
		
		
	}

	/**
	 * Translates the information into a string for the user to read.
	 */
	public String toString() {
		return "day= " + day;
	}
}
