package lr1;

import java.util.Scanner;

public class Example_13_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter katet a: ");
		double a =input.nextDouble();
		System.out.println("Enter katet b: ");
		double b =input.nextDouble();
		System.out.println("hypotenuse с=" + hyp(a,b));
		input.close();

	}
	public static double hyp(double a, double b){
		return Math.sqrt(Math.exp(2*Math.log(a)) + Math.exp(2*Math.log(b)));
		}

}
