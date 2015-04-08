/**
 * Room class is for creating a simulated representation of a room in a house.
 * @author Arthur Smith
 *
 */
public class Room {
	
		
	
		private String flooring;
		private String color;
		private int windows;
		
		/**
		 * Initializes the variables of the room to default.
		 */
		
		public Room () {
			this.flooring = "hard wood";
			this.color = "yellow";
			this.windows = 1;
		}
		/**
		 * Initializes the variables of the room.
		 * @param flooring
		 * @param color
		 * @param windows
		 */
		public Room (String flooring, String color, int windows) {
			this.flooring = flooring;
			this.color = color;
			this.windows = windows;
		}
		
		/**
		 * Returns the type of the floor in the room.
		 * @return flooring
		 */
		
		public String getFlooring() {
			return this.flooring;
		}
		
		/**
		 * Sets the type of the floor in the room.
		 * @param flooring
		 */
		
		public void setFlooring(String flooring) {
			this.flooring = flooring;
		}
		
		/**
		 * Returns the color of the room.
		 * @return color
		 */
		
		public String getColor() {
			return this.color;
		}
		
		/**
		 * Sets the color of the room.
		 * @param color
		 */
		
		public void setColor (String color) {
			this.color = color;
		}
		/**
		 * Returns the number of windows in the room.
		 * @return windows
		 */
		
		public int getWindows () {
			return this.windows;
		}
		
		/**
		 * Sets the number of windows in the room.
		 * @param windows
		 */
		
		public void setWindows (int windows) {
			this.windows = windows;
		}
		/**
		 * Returns the information of the room in a string.
		 */
		public String toString() {
			return "The room's floor type is " + this.flooring + ", the room's color is " + this.color + ", and the number of windows is " + this.windows +".";
		}
}