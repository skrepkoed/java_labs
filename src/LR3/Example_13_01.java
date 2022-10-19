package LR3;
import java.util.Scanner;



public class Example_13_01 {

	public static void main(String[] args) {
		System.out.println("Enter number of weekday");
		Scanner input= new Scanner(System.in);
		int weekNumber= input.nextInt();
		input.close();
		switch (weekNumber){
		case 1: {
			weekday(weekNumber);
			break;
		}
		case 2:{
			weekday(weekNumber);
			break;
		}
		case 3:{
			weekday(weekNumber);
			break;
		}
		case 4:{
			weekday(weekNumber);
			break;
		}
		case 5:{
			weekday(weekNumber);
			break;
		}
		case 6:{
			weekday(weekNumber);
			break;
		}
		case 7:{
			weekday(weekNumber);
			break;
		}
		
		default:
			System.out.println("There is no such day in week");
		}
	}
	
	private static void weekday(int weekNumber) {
		String weekday []= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		System.out.println(weekday[weekNumber-1]+" is "+weekNumber+ " day of week");
	}

}
