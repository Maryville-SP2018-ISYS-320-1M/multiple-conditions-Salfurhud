import java.util.Scanner;
/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

public class P4_ColorNamer {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("What color should be named? ");
		String color = console.next();
		
		if( color.toLowerCase().equals("g") ) {
			System.out.println("The name is Green.");
		} else if( color.toLowerCase().equals("r") ) {
			System.out.println("The name is Red.");
		} else if( color.toLowerCase().equals("b") ) {
			System.out.println("The name is Blue.");
		} else {
			System.out.println("Error: I don't know what a " + color + " is.");
		}
	}

}