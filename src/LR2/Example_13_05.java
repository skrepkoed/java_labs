package LR2;

import java.util.Iterator;
import java.util.Scanner;

public class Example_13_05 {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		Scanner input=new Scanner(System.in);
		double input_number = input.nextDouble();
		int number = (int) input_number;
		int  thousands=0;
		for(int i=0; i<4; i++) {
			thousands=number%10;
			number=(number-thousands)/10;
		}
		
		System.out.println("Number "+input_number+" contains "+thousands+" thousands ");
		input.close();

	}

}
