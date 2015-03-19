import javax.swing.JOptionPane;
public class TeamAndPeople2 {

	public static void main(String[] args) {
		int numPeople, numPlayers, groupSize, teamSize;
		boolean playersGreaterThan11 = false, playersLessThan55 = false, peopleLessThan3 = false;
		
		numPeople = Integer.parseInt (JOptionPane.showInputDialog(null, "Input the number of people."));
		numPlayers = Integer.parseInt (JOptionPane.showInputDialog(null, "Input the number of players."));
		//Number of people and group size 
		peopleLessThan3 = false;
		if (numPeople > 10) {
			groupSize = numPeople/2;
		} else {
			groupSize = numPeople/3;
		}
		
		if (numPeople <3) {
			JOptionPane.showMessageDialog(null, "The number of people has to be at least 3.");
			
		}
		
		
		//Number of players and team
		if (numPlayers > 11) {
			playersGreaterThan11 = true;
		} else {
			playersGreaterThan11 = false;
		}
		
		if (numPlayers < 55) {
			playersLessThan55 = true;
		} else {
			playersLessThan55 = false;
		}
		
		if ((playersGreaterThan11=true) && (playersLessThan55=true)) {
			teamSize = numPlayers / 11;
		} else {
			teamSize = 1;
		}
		
		JOptionPane.showMessageDialog(null, "The number of people is " + numPeople + " and the size of the group is " + groupSize + 
				"\nThe number of players is " + numPlayers + " and the team size is " + teamSize);
	

	}
}
