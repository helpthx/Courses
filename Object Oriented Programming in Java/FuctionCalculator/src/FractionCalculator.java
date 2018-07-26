import java.util.Scanner;

public class FractionCalculator {

public static void main(String[] args){
    intro();
    execution();
}

public static void intro(){
    System.out.println("This program is a fraction calculator.\n" +
            "It will perform operations until you type Q to quit.\n" +
            "Please enter your fraction in the form a/b, where a and b are integers.\n" +
            "Integers should not exceed 2^63.");
}

public static void execution() {

    System.out.println("-----------------------------------------------------------------------------------------");

    Scanner operationInput = new Scanner(System.in);
    System.out.print("Please enter an operation (+, -, /, *, = or Q to quit): ");
    String operation = getOperation(operationInput);

    if (!operation.equalsIgnoreCase("Q")) {
        Scanner fraction1Input = new Scanner(System.in);
        System.out.print("Please enter a fraction (a/b) or integer (a): ");
        Fraction fraction1 = getFraction(fraction1Input);
        int num1 = fraction1.getNum();
        int den1 = fraction1.getDen();

        Scanner fraction2Input = new Scanner(System.in);
        System.out.print("Please enter a fraction (a/b) or integer (a): ");
        Fraction fraction2 = getFraction(fraction2Input);
        int num2 = fraction2.getNum();
        int den2 = fraction2.getDen();

        if ("+".equals(operation)) {
            Fraction result = fraction1.add(fraction2);
            result.toLowestTerms();
            System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + result.toString());
            execution();
        } else if ("-".equals(operation)) {
            Fraction result = fraction1.substract(fraction2);
            result.toLowestTerms();
            System.out.println(num1 + "/" + den1 + " - " + num2 + "/" + den2 + " = " + result.toString());
            execution();
        } else if ("/".equals(operation)) {
            Fraction result = fraction1.divide(fraction2);
            result.toLowestTerms();
            System.out.println(num1 + "/" + den1 + " / " + num2 + "/" + den2 + " = " + result.toString());
            execution();
        } else if ("*".equals(operation)) {
            Fraction result = fraction1.multiply(fraction2);
            result.toLowestTerms();
            System.out.println(num1 + "/" + den1 + " * " + num2 + "/" + den2 + " = " + result.toString());
            execution();
        } else {
            System.out.println(num1 + "/" + den1 + " = " + num2 + "/" + den2 + " is " + fraction1.equals(fraction2));
            execution();
        }
    } else {
        System.out.println("Goodbye!");
    }
}

public static String getOperation(Scanner input) {
    String operation = input.next();
    while (!operation.matches("[+\\-,/*=qQ]")) {
        Scanner rePromptInput = new Scanner(System.in);
        System.out.print("Invalid input (+, -, /, *, = or Q to quit): ");
        operation = rePromptInput.next();
    }
    return operation;
}

public static Fraction getFraction(Scanner input){
    String fractionStr = input.next();
    while (!fractionStr.matches("-?\\d+/*(\\+?[1-9]\\d*)*")){
        Scanner rePromptInput = new Scanner(System.in);
        System.out.print("Invalid fraction. Please enter (a/b) or (a): ");
        fractionStr = rePromptInput.next();
    }
    if (fractionStr.contains("/")) {
        String[] splitFraction = fractionStr.split("/");
        return new Fraction(Integer.parseInt(splitFraction[0]),Integer.parseInt(splitFraction[1]));
    } else {
        return new Fraction(Integer.parseInt(fractionStr));
    }
}
}