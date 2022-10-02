package lr1;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number a: ");
		double a =input.nextDouble();
		System.out.println("Number less than a by 1: "+(a-1));
		System.out.println("Number a: "+a);
		System.out.println("Number more than a by 1: "+(a+1));
		System.out.println("Square of the first three numbers: "+(Math.pow((a-1),2)+Math.pow((a+1),2)+Math.pow(a,2)));
		input.close();
	}

}
