/*I would have implemented more methods, such as "horizontalbar", but the lines for this 
ascii art are so random creating new methods would actually increase the work 
needed to write the code. Also, in case you are wondering, my two special string characters are the \n
new line as well as the \\ in order to print out a \
 */

public class ASCIIArt {
	public static void main (String [] args) {
		rasmussen();
		is();
		our();
		god();
	}
	public static void rasmussen () {
		System.out.print("  ___\n");
		System.out.print(" | _ \\__ _ ____ __ _  _ ______ ___ _ _  \n");
		System.out.print(" |   / _` (_-< '  \\ || (_-<_-</ -_) ' \\  \n");
		System.out.print(" |_|_\\__,_/__/_|_|_\\_,_/__/__/\\___|_||_|\n");
		System.out.println();
		
	}
	public static void is () {
		System.out.print("  _ _\n");
		System.out.print(" |_ _|___\n");
		System.out.print("  | |(_-<  \n");
		System.out.print(" |___/__/\n");
		System.out.println();
	}
	public static void our () {
		System.out.print("   ___          \n");
		System.out.print("  / _ \\ _  _ _ _ \n");
		System.out.print(" | (_) | || | '_|\n");
		System.out.print("  \\___/ \\_,_|_|  \n");
		System.out.println();
	}
	public static void god () {
		System.out.print("    _          _\n");
		System.out.print("  / __|___  __| |\n");
		System.out.print(" | (_ / _ \\/ _` |\n");
		System.out.print("  \\___\\___/\\__,_|\n");
		System.out.println();
	}
}
