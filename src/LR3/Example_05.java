package LR3;

import java.util.Scanner;

public class Example_05 {

	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		System.out.println("Enter number a:");
		int number= inputScanner.nextInt();
		inputScanner.close();
		int [] result= new int [number];
		int counter=0;
		int sum=0;
		number-=1;
		while (number!=-1) {
			counter+=1;
			if (counter%5==2||counter%3==1) {
				sum+=counter;
				result[number]=counter;
				number-=1;
			}
		}
		for(int i: result) {
			System.out.print(i+" ");
			
		}
		System.out.print("\n");
		System.out.print("Sum: "+sum);

	}

}
