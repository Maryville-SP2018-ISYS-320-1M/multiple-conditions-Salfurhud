import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

public class P5_ShapeChooser {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What shape would you like to draw? ");
		String shapeToDraw = console.next();
		
		if( shapeToDraw.equals("tri")) {
			drawTri();
		} else if( shapeToDraw.equals("box")) {
			drawBox();
		} else {
			System.out.println("Error. Could not recognize should!");
		}
	}
	
	private static void drawBox() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <=9; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void drawTri() {
		for( int row = 1; row <=5; row++ ) {
			for( int col = 1; col <= 5 - row; col++) {
				System.out.print(" ");
			}
			
			for( int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
