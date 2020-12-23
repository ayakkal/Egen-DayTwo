package Carpet;

import java.util.Scanner;

public class CostCalculator {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter country: ");
		String country = sc.nextLine();
		System.out.print("Enter length: ");  
		int length = sc.nextInt();
		System.out.print("Enter width: ");  
		int width = sc.nextInt();
		sc.close();
		
		
		RoomCarpet roomCarpet = new RoomCarpet(length, width,country);
		
		System.out.println("The total cost for flooring the carpet is :" + roomCarpet.totalCost());
		
		

	}

}
