package LR2;

import java.util.Scanner;

public class Example_13_01 {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner input=new Scanner(System.in);
		double number =  input.nextDouble();
		double remainder = number%3;
		if (remainder==0) {
			System.out.println("Number "+number+" divisible by 3 without remainder.");
		}else {
			System.out.println("Number "+number+" divisible by 3 with remainder "+remainder+".");
		}
		input.close();
	}
}
