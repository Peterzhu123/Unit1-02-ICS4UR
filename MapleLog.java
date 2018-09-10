/****************************************************************************
 *
 * Created by: Peter Zhu
 * Created on: September 2018
 * This program calculate how many logs can carry on the truck
 *
 ****************************************************************************/
import java.util.Scanner;

public class MapleLog {

	public static void main(String[] args) {
		
		//Create the scanner and ask for the input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the maple log (0.25m,0.5m,1m)");
		double theLengthOfLog = scanner.nextDouble();
		scanner.close();
		
		// Test the input whether valid
		if(theLengthOfLog != 0.25 && theLengthOfLog != 0.5 && theLengthOfLog != 1) {
			System.out.println(" Invalid input! You can only choose numbers in the bracket. ");
		}else {
			int theNumberOfLog = (int) (1100/(theLengthOfLog * 20));			
			System.out.println("The truck can carry " + theNumberOfLog + " logs that are " + theLengthOfLog + " meters long. ");
		}
		
	}

}
