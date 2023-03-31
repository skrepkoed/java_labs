package lr5;

public class Example_01 {

	public static void main(String[] args) {
		PrivateField.setPrivateField('A');
		System.out.println(PrivateField.getPrivateFieldOrd());
		PrivateField.getPrivateField();
	}	
}
class PrivateField{
		
	private static char field;
	
	public static void setPrivateField(char variable) {
		field=variable;
	}
	
	public static int getPrivateFieldOrd() {
		return field;
	}
	
	public static void getPrivateField() {
		System.out.println(field+" "+ getPrivateFieldOrd());
	}
}
