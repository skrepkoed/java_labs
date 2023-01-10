package LR3;

import java.util.Arrays;
import java.util.Scanner;

public class Example_09 {
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
		leastNumber(result);
	}
	public static void leastNumber(int[] result) {
		System.out.println(result[0]+" has index "+0);
		for(int i=0; i<result.length-1;i++) {
			if (result[i]==result[i+1]){
				System.out.println(" and index "+(i+1));
			}else {
				return;
			}
		}
	}
}
