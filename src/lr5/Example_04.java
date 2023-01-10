package lr5;

public class Example_04 {
	public static void main(String[] args) {
		IntAndChar obj1= new IntAndChar(65.1267);
		System.out.println(obj1.getIntField());
		System.out.println(obj1.getCharField());
		IntAndChar obj2= new IntAndChar(45,'D');
		System.out.println(obj2.getIntField());
		System.out.println(obj2.getCharField());
	}
}
class IntAndChar{
	private int intField;
	private char charField;
	private double doubleField;
	
	public int getIntField() {
		return intField;
	}
	public char getCharField() {
		return charField;
	}
	public double getDoubField() {
		return doubleField;
	}
	public IntAndChar(int intField, char charField) {
		this.intField=intField;
		this.charField=charField;
	}
	
	public IntAndChar(double doubleField) {
		doubleField=Math.floor((doubleField*100))/100;
		double integerPart=Math.floor(doubleField);
		double decimalPart=doubleField-integerPart;
		charField=(char)(integerPart);
		intField= (int) decimalsOrHundrends(decimalPart);
		
	}
	
	private double decimalsOrHundrends(double decimalPart) {
		double decimal = Math.round(decimalPart*10);
		double hundreds = Math.round(decimalPart*100);
		if (decimal==hundreds/10) {
			return decimal;
		}else {
			return hundreds;
		}
	}
	
}

