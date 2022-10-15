package LR2;

import java.util.Scanner;

public class Example_13_03 {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner input=new Scanner(System.in);
		double number =  input.nextDouble();
		double remainderFromDivisionBy4= number%4;
		
		if (remainderFromDivisionBy4==0 && number>10) {
			System.out.println("Number "+number+" is divisible by 4 and greater than 10 ");
		}else {
			System.out.println("Not suitable number");
		}
		input.close();

	}

}
