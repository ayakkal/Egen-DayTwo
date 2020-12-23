package rpsgame;

import java.util.Random;
import java.util.Scanner;

public class HumanPlayer implements RPSPlayer {
	
	@Override
	public String play() {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please select your play by typing either one of these {Rock, Paper, Scissor} : ");
		String humanPlay = sc.nextLine();
		//sc.close();
		return humanPlay;
		
	}

}
