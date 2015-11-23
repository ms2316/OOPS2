package uk.ac.cam.ms2316.oopjava.sup2;
public class Game {
	
	private String player;
	private int movesMade;
	private int movesAllowed;
	private boolean won;

	public Game(String player, int movesMade, int movesAllowed, boolean won) {
		this.player = player;
		this.movesMade = movesMade;
		this.movesAllowed = movesAllowed;
		this.won = won;
	}

	public String getPlayer() {return player;}
	public int getMovesMade() {return movesMade;}
	public int getMovesAllowed() {return movesAllowed;}	
	public boolean getWon() {return won;}	

	public String toString() {
		return ("Player " + player + " made " + movesMade + " moves out of " + movesAllowed + " allowed and " + (won ? " won the game" : "lost the game"));
	}
}
