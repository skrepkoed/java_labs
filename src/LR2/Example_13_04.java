package LR2;

import java.util.Scanner;

public class Example_13_04 {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner input=new Scanner(System.in);
		double number =  input.nextDouble();
		
		
		if (number>=5 && number<=10) {
			System.out.println("Number "+number+" between 5 and 10 ");
		}else {
			System.out.println("Not suitable number");
		}
		input.close();

	}

}
