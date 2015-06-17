package main;

public class BattleTanks {
	
	public static void main(String[] args) {
		OrganizeTanks org = new OrganizeTanks();
		AiTanks ai = new AiTanks();
		Turn t = new Turn();
		System.out.println("Tutorial: You and the Ai each place 4 tanks on your own fiels.");
		System.out.println("After that, you take turns trying to guess where the enemy tanks are.");
		System.out.println("If you hit a tank, the symbol X will apear on the enemy grid.");
		System.out.println("If you miss, the symbol O will apear");
		System.out.println("Game stops when either you or the ai destroy the enemy tanks.");
		System.out.println("(Pay attention, as you can bomb the same place twice)");
		
		t.full_board(org.gg(), ai.random());
}
}
