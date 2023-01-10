package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example_13_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = input.nextLine();
		name=name.substring(0,1).toUpperCase()+name.substring(1)+". ";
		System.out.println("Enter your year of birth");
		int year_of_birth = input.nextInt();
		int current_year=LocalDate.now().getYear();
		int age = current_year-year_of_birth;
		System.out.println("Hello "+name+"Your age is:"+age);
		input.close();

	}

}
