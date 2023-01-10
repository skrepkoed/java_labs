package lr1;

import java.util.Scanner;

public class Example_13_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double a =input.nextDouble();
		System.out.println("Enter second number: ");
		double b = input.nextDouble();
		System.out.println("a^b= "+(Math.pow(a, b)));
		input.close();

	}

}
