import java.util.Scanner;
import java.util.Locale; 

public class TripPlanner {
	public static final Scanner input = new Scanner(System.in);
	
	public TripPlanner() {
	
	}

	public static void main(String[] args) {
	    Greeting();
		System.out.println();		
		TravelBudget();
		System.out.println();
		TimeDifference();
		System.out.println();
		CountryArea();
		System.out.println();
		System.out.println();
		System.out.println("Process finished with exit code 0");


	}
	
	public static void Greeting() {
		System.out.println("Welcome to Vacation Planner!");
		System.out.print("What is your name?: ");
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", Where are you travelling to?: ");
		String local = input.nextLine();
		System.out.println("Great! " + local +" sounds like a great trip");
		System.out.println("*************************************************");
				
	}

	public static void TravelBudget() {
		System.out.print("How many days are they going to spend in their destination?: ");
		int Days = input.nextInt();
		System.out.print("What is their total budget for the trip in USD?: ");
		int Money = input.nextInt();
		System.out.print("What is the currency symbol for their destination?: ");
		String symbol = input.next();
		System.out.print("How many "+ symbol +" are there in 1 USD? ");
		double rate = input.nextDouble();
		int hours = Days * 24;
		int minuts = hours * 60;
		System.out.println();
		System.out.println("If you travelling for "+ Days + " days that is the same as " + hours + " hours or " + minuts + " minutes");
		double DayMoney =  ((Money / Days));
		System.out.println("If you going to spend $" + Money + " USD that means per day you can spend up to $" + DayMoney + " USD");
		double totalMoney = Money*rate;
		double totalMoneyDay = 200.0*(DayMoney*rate)/200.00;
		System.out.println("Your total budget in "+ symbol + " is " + totalMoney + " " + symbol + ", which per day is " + totalMoneyDay + " " + symbol);
		System.out.println("*************************************************");
		}
	
	public static void TimeDifference() {
		System.out.print("What is the time difference, in hours, between your home and you destination?: ");
		int hours = input.nextInt();
		double convertMid = hours % 24.00;
		double convertNoon = 12.00 +(hours % 24.00);
		System.out.println("That means that when it is midnigth at home it will be " + convertMid + " in your travel destination and when it is noon at home it will be " + convertNoon);
		System.out.println("*************************************************");
		}
	public static void CountryArea(){
		System.out.print("What is the square area of your destination country in km2?: ");
		int area = input.nextInt();
		double areaM = 0.386102*area;
		System.out.println("In mile2 that is "+ areaM);
		System.out.println("*************************************************");
		
	}
}

