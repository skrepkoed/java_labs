package LR3;

import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner input = new Scanner(System.in);
		double[] result = fib_recursive(input.nextInt());
		input.close();
		for(double fib:result) {
			System.out.println(fib+" ");
		}
	}
	
	public static double[] fib_recursive(int number) {
		double [] fib_sequence=new double[number]; 
		double fib_1=0;
		double fib_2=1;
		fib_sequence[0]=0;
		fib_sequence[1]=1;
		number-=2;
		double counter=2;
		fib_sum(fib_1, fib_2, number, fib_sequence,counter);
		return fib_sequence;
		
	}
	
	public static double fib_sum(double fib_1, double fib_2,double number, double[] fib_sequence, double counter) {
		double sum=fib_1+fib_2;
		fib_sequence[(int) (counter)]=sum;
		number-=1;
		counter+=1;
		if (number==0) {
			return sum;
		}else {
			fib_sum(fib_2, sum, number, fib_sequence,counter);
		}
		return sum;
	}
	
	public static double[] fib(int number) {
		double[] fib_seqeunce= new double[number];
		double first_fib=0;
		double second_fib=1;
		fib_seqeunce[0]=0;
		fib_seqeunce[1]=1;
		double counter=2;
		while(counter!=number) {
			fib_seqeunce[(int)counter]=second_fib+first_fib;
			first_fib=second_fib;
			second_fib=fib_seqeunce[(int)counter];
			counter+=1;
		}
		
		return fib_seqeunce;
	}

}
