package LR3;

public class Example_08 {

	public static void main(String[] args) {
		int array_length=10;
		char [] array= new char[array_length];
		char a='A';
		for(int i=0; i<array_length;) {
			switch (a) {
			case 'A':{
				break;
			}
			default:{
				array[i]=a;
				i+=1;
				break;
			}
			}
			a+=1;
		}
		for(int i=0; i<array_length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}
