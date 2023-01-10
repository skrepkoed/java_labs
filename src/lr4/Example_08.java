package lr4;

import java.util.Scanner;

public class Example_08 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter string for Encryption");
		String stringForEncriptionString= new String(); 
		stringForEncriptionString=input.next();
		int key=0;
		System.out.println("Enter key");
		key=input.nextInt();
		System.out.println("Encrypted text:"+encryption(stringForEncriptionString, key));
		boolean decrypt=false;
		while(!decrypt) {
			System.out.println("Do you want to decrypt string?");
			String answerString= new String();
			answerString=input.next();		
			if(answerString.equals("y")){
				System.out.println(stringForEncriptionString);
				decrypt=true;
			} else if (answerString.equals("n")) {
				decrypt=true;
				System.out.println("Goodbye");
			}else {
				System.out.println("Enter correct value");
			}
			input.close();
		}
		
		
		

	}
	public static String encryption(String str, int key) {
		char[] ArrayChar = str.toCharArray();
		char[] EncryptedChar=new char[ArrayChar.length];
		for(int i=0;i<ArrayChar.length;i++) {
			EncryptedChar[i]=(char) (ArrayChar[i]+key);
		}	
		return new String(EncryptedChar);
	}

}
