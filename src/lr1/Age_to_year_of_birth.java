package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Age_to_year_of_birth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=input.nextInt();
		int current_year=LocalDate.now().getYear();
		int year_of_birth = current_year-age;
		System.out.println("Your date of birth: "+year_of_birth);
		input.close();
	}

}
