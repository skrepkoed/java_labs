package LR3;

import java.util.Scanner;

public class Example_06 {

	public static void main(String[] args) {
		Scanner inputScanner= new Scanner(System.in);
		System.out.println("Enter number a:");
		try {
			int number= inputScanner.nextInt();
			int [] result= new int [number];
			for(int i=0,counter=0;i<number;counter++){ 
				if (counter%5==2) {
					result[i]=counter;
					i+=1;
				}
			}
			
			for(int i: result) {
				System.out.print(i+" ");			
			}
			System.out.print("\n");
		} catch (Exception e) {
			System.out.println("Unexpected value");
		}
		inputScanner.close();		
	}
}
