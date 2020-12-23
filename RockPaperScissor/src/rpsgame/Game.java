/**
 * 
 */
package rpsgame;

import java.util.Random;
import java.util.Scanner;

/**
 * @author akhil
 *
 */
public class Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RPSPlayer humanPlayer = new HumanPlayer();
		RPSPlayer computerPlayer = new ComputerPlayer();
	
			do {
				String hplay = humanPlayer.play();
				String cplay = computerPlayer.play();
				if(hplay.equals(cplay)) {
					System.out.println(" Game Tied");	
				}else {
					if(hplay.equals("Rock") && cplay.equals("Scissor") || hplay.equals("Scissor") && cplay.equals("Paper") || hplay.equals("Paper") && cplay.equals("Rock")) {
						System.out.println("You win");	
					}else {
						System.out.println("Computer wins");
					}	
				}
			}while(playAgain());	
			
			
		}
		
	public static  boolean playAgain() {
	
		Scanner sc = new Scanner(System.in);	
		System.out.println("Want to play again? Press y for YES or n for NO");
		String action = sc.nextLine();
		System.out.println(action);
		switch (action)	{
		
		case "y": 
			System.out.println("Rock Paper Scissor!!!");
			return true;
		case "n":
			System.out.println("Thank you for playing");
			sc.close();
			return false;
		default :
			System.out.println("Type y or n");
			playAgain();
		}
		sc.close();
		return false;
	}

}
