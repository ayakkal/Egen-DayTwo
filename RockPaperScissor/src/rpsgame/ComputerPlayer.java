package rpsgame;

import java.util.Random;

public class ComputerPlayer implements RPSPlayer {
	
	private Random random = new Random();

	@Override
	public String play() {
		
		return str[random.nextInt(str.length)];
		
	}

	
	
}
