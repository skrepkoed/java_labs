package lr1;

import java.util.Scanner;

public class Example_13_09 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = input.nextLine();
		name=name.substring(0,1).toUpperCase()+name.substring(1)+" ";
		System.out.println("Enter your age:");
		int age= input.nextInt();
		input.close();
		System.out.println(name+"your age is:"+age);
		
	}
}
