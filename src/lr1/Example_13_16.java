package lr1;

import java.util.Scanner;

public class Example_13_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number a: ");
		double a =input.nextDouble();
		double b = a-1;
		double c = a+1;
		double d = Math.pow(a+b+c,2);
		System.out.println("Number less than a by 1: "+ b);
		System.out.println("Number a: "+a);
		System.out.println("Number more than a by 1: "+c);
		System.out.println("Square of the sum of the first three numbers: "+d);
		input.close();
	}

}
