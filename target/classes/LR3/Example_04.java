package LR3;

import java.util.Scanner;

public class Example_04 {

	public static void main(String[] args) {
		aAndB2();
	}
	public static void aAndB2() {
		Scanner inputScanner= new Scanner(System.in);
		System.out.println("Enter number a:");
		double a= inputScanner.nextDouble();
		System.out.println("Enter number b:");
		double b= inputScanner.nextDouble();
		inputScanner.close();
		double diff=(a-b)/Math.abs(a-b);
		switch ((int)diff) {
		case (int)1.0: {
			System.out.println(b+" "+a);
			break;
		}
		case (int)-1.0:{
			System.out.println(a+" "+b);
			break;
		}
		}
	}
	public static void aAndB1() {
		Scanner inputScanner= new Scanner(System.in);
		System.out.println("Enter number a:");
		double a= inputScanner.nextDouble();
		System.out.println("Enter number b:");
		double b= inputScanner.nextDouble();
		inputScanner.close();
		double diff=a-b;
		if (diff<=0) {
			System.out.println(a+" "+b);
		}else{
			System.out.println(b+" "+a);
		}
	}

}
