package LR3;

import java.util.Arrays;
import java.util.Scanner;

public class Example_10 {

	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		System.out.println("Enter number a:");
		int number= inputScanner.nextInt();
		inputScanner.close();
		int [] result= new int [number];
		for(int i=0; i<number;i++) {	
			result[i]= (int)(Math.random()*10)+1;
		}
		Arrays.sort(result);
		for(int i=result.length-1;i>=0;i--) {
			System.out.print(result[i]+" ");
		}

	}

}
