import javax.swing.JOptionPane;
public class TeamAndPeople {

	public static void main(String[] args) {
		int numPeople, numPlayers, groupSize, teamSize;
		
		numPeople = Integer.parseInt (JOptionPane.showInputDialog(null, "Input the number of people."));
		numPlayers = Integer.parseInt (JOptionPane.showInputDialog(null, "Input the number of players."));
		
		if (numPeople > 10) {
			groupSize = numPeople/2;
		} else {
			groupSize = numPeople/3;
			numPeople = numPeople + 1;
		}
		
		if (numPlayers > 11) {
			teamSize = 11;
			teamSize = numPlayers/2;
			numPlayers = numPlayers+1;
		} else {
			teamSize = numPlayers;
			teamSize = numPlayers/2;
			numPlayers = numPlayers+1;
		}
		
		JOptionPane.showMessageDialog(null, "The number of people is " + numPeople + " and the size of the group is " + groupSize + 
				"\nThe number of players is " + numPlayers + " and the team size is " + teamSize);

	}

}
