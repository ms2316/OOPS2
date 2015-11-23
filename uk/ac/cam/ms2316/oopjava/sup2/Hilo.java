package uk.ac.cam.ms2316.oopjava.sup2;

public class Hilo {
	
	private int gamesPlayed;	
	private ArrayList<Game> l;

	public Hilo() {
		gamesPlayed = 0;
		l = new ArrayList<Game>();
	}
	
	public int getGamesPlayed() {return gamesPlayed;}

	public void showScoreBoard() {
		for (Game tmp : l) {
			System.out.println(tmp.toString());
		}
	}

	public void playNext() {
		String usrName = System.console().readLine("Enter your name then press enter: ");
		
		int allowed;
		try {
			allowed = Integer.parseInt(System.console().readLine("Enter No of allowed moves &press enter: "));	
		} catch (Exception e) {
			System.out.println("Invalid number entered");
			return;
		}
		
		Random rnd = new Random();
		int number = rnd.nextInt(100);
		
		int currentMoves = 0;
		System.out.println("To make a guess write a number and press enter");
		System.out.println("Press q & enter for exit");
		while (true) {	
			try {
				String usrResponse = System.console().readLine();
				if (usrResponse.equals("q")) {
					return;
					//unfinished game
				}
				int guess = Integer.parseInt(usrResponse);	
				if (guess < number) {
					System.out.println("go higher");
				} else if (guess > number) {
					System.out.println("go lower");
				} else {
					System.out.println("You won");	
					l.add(new Game(usrName, currentMoves, allowed, true));
					return;
				}
				if ( (++currentMoves) >= allowed ) {
					System.out.println("You loose");	
					l.add(new Game(usrName, currentMoves, allowed, false));
					return;
				}
			} catch (Exception e) {
				System.out.println("Invalid number entered");
				System.out.println("To make a guess write a number and press enter");
				System.out.println("Press q & enter for exit");
			}
		}
		
	}

}
