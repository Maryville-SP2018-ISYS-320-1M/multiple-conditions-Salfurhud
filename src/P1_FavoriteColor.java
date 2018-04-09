import java.util.Scanner;

/*
ISYS 320
Name(s):AlfurhudSolomon
Date: Apr8, 2018
*/

/*  What was the error?
 
 	When using == in java you are comparing references rather than the values.
  
 */

public class P1_FavoriteColor {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String name = console.next();
		
		if( name == "blue") {
			System.out.println("Mine too!");
		}

	}

}
