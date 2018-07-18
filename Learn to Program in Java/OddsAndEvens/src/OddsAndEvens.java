import java.util.Scanner;
import java.util.*;


public class OddsAndEvens {
	public static String name;
	public static String pick;
	public static final Scanner input = new Scanner(System.in);
	public static int finger;
	public static int computer;

	public OddsAndEvens() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name();
		System.out.println();
		System.out.println("-----------------------------------");
		Pick();
		System.out.println();
		System.out.println("-----------------------------------");
		Play();
		System.out.println();
		System.out.println("-----------------------------------");
		Win();
		System.out.println();
		System.out.println("-----------------------------------");
		

	}
	
	public static void Name() {
		System.out.println("Let’s play a game called “Odds and Evens”");
		System.out.print("What is your name?: ");
		name = input.nextLine();
		
	}	
	public static void Pick() {
		System.out.print("Hi " + name +" which do you choose? (O)dds or (E)vens? ");
		pick = input.nextLine();
		if(pick.equals("O")){
			System.out.println(name +" has picked odds! The computer will be evens.");
				
		}
		else if(pick.startsWith("E")) {
			System.out.println(name +" has picked evens! The computer will be odds.");
		}
		else {
			System.out.println("Error 1 ");
			Pick();
		
		}

	}
	public static void Play() {
		System.out.print("How many “fingers” do you put out? ");
		finger = input.nextInt();
		Random rand = new Random();
		computer = rand.nextInt(11);
		System.out.println("The computer plays number " + computer + " “fingers” ");
		
	}
	public static void Win() {
		int result = finger + computer;
		System.out.println( finger + " + " + computer + " = " + result);
		double rest = result % 2;
		if(rest == 0.0) {
			System.out.println(result + " is ...even!");
		}
		else {
			System.out.println(result + " is ...odd!");
		}
		if(pick.equals("E") && rest == 0.0) {
			System.out.println("That means "+ name + " wins ! :)");
		}
		else if(pick.equals("O") && rest == 1.0) {
			System.out.println("That means "+ name + " wins ! :)");
		}
		else {
			System.out.println("That means computer wins ! :(");
		}
	}
}