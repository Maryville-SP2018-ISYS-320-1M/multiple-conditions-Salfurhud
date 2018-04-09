import java.util.Scanner;

/*
ISYS 320
Name(s):AlfurhudSolomon
Date: Apr8, 2018
*/

public class P2_DonationMatcher {

	public static void main(String[] args) {

		int donationsSum = 1000;
		int donationsCount = 20;
		Scanner console = new Scanner(System.in);
		System.out.print("Will you donation be multiplied 1 or 2? ");
		int multiplier = console.nextInt();
		
		if(multiplier <= 0) {
			System.out.print("Error! Incorrect multiplier");
			return;
		}

				
		System.out.print("And how much are you donating? ");
		int donation = console.nextInt();
		
		int multiplyBy = 1; //default value is 1
		
		if (multiplier == 2) { //set to 2 if user changes value
			multiplyBy = 2;
		} 
		
		donationsSum = donationsSum + multiplyBy * donation;
		donationsCount++;

		System.out.println("Total donated sum: " + donationsSum);
		System.out.println("Total number of donations: " + donationsCount);
	}

}