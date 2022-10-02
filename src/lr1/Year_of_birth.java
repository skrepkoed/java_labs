package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Year_of_birth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your year of birth");
		int year_of_birth = input.nextInt();
		int current_year=LocalDate.now().getYear();
		int age = current_year-year_of_birth;
		if (age>0) {
			System.out.println("Your age is: "+age);
		} else {
			System.out.println("Wrong day of birth");
		}
		
		input.close();

	}

}
