package LR3;

public class Example_07 {

	public static void main(String[] args) {
		int array_length=10;
		char [] array= new char[array_length];
		char a='a';
		for(int i=0; i<array_length;i++) {
			array[i]=a;
			a+=2;
		}
		for(int i=0; i<array_length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.print("\n");
		for(int i=array_length-1; i>=0;i--) {
			System.out.print(array[i]+" ");
		}
		
		

	}

}
