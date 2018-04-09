import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: apr8, 2018
*/

public class P6_Quadrant {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter values for x and y separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if( x >= 0 && y >= 0) {
			System.out.println("Quadrant I");
		} else if( x < 0 && y >= 0) {
			System.out.println("Quadrant II");
		} else if( x < 0 && y < 0) {
			System.out.println("Quadrant III");
		} else if( x >= 0 && y < 0) {
			System.out.println("Quadrant 1");
		}
	}

}
