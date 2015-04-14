/**
 * Creates several example rooms using the Room class.
 * @author Arthur
 *
 */
public class RoomDriver {

	public static void main(String[] args) {
		
		Room room1 = new Room();
		System.out.println(room1.toString());
		
		Room room2 = new Room("tile", "purple", 0);
		System.out.println(room2.toString());
		
		Room room3 = new Room ("carpet", "white", 3);
		System.out.println(room3.toString());

	}

}
