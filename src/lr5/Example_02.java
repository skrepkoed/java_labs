package lr5;

public class Example_02 {

	public static void main(String[] args) {
		BetweenFields.setField1('A');
		BetweenFields.setField2('D');
		BetweenFields.betweenFields();
	}
	

}

class BetweenFields{
	private static char field1;
	private static char field2;
	
	public static void betweenFields() {
		for(int i=field1;i<=(int)field2;i++) {
			System.out.print((char)i+" ");
		}
	}
	public static void setField1(char field) {
		field1=field;
	}
	public static void setField2(char field) {
		field2=field;
	}
}
