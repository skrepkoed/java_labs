package LR2;

import java.util.Scanner;

public class Example_13_02 {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner input=new Scanner(System.in);
		double number =  input.nextDouble();
		double remainderFromDivisionBy5= number%5;
		double remainderFromDivisionBy7= number%7;
		
		if (remainderFromDivisionBy5==2 && remainderFromDivisionBy7==1) {
			System.out.println("Number "+number+" is divisible by 5 with remainder 2 and divisible by 7 with remainder 1 ");
		}else {
			System.out.println("Not suitable number");
		}
		input.close();
	}

}
