package lr5;

public class Example_05 {

	public static void main(String[] args) {
		LessOrEqual100 obj1 = new LessOrEqual100(55);
		System.out.println("Object with arg 55: "+ obj1.getField());
		LessOrEqual100 obj2 = new LessOrEqual100(101);
		System.out.println("Object with arg 101: "+obj2.getField());
		LessOrEqual100 obj3 = new LessOrEqual100();
		System.out.println("Object without arg : "+obj3.getField());
		LessOrEqual100 obj4 = new LessOrEqual100();
		System.out.println("Same with method call:");
		obj4.setField(55);
		System.out.println("Object with arg 55: "+ obj4.getField());
		obj4.setField(101);
		System.out.println("Object with arg 101: "+ obj4.getField());
		obj4.setField();
		System.out.println("Object without arg: "+ obj4.getField());

	}
}
class LessOrEqual100{
	private int field;
	
	public LessOrEqual100(int number) {
		this.setField(number);
	}
	
	public LessOrEqual100() {
		this.setField();
	}
	
	public int getField() {
		return field;
	}
	
	public void setField(int number) {
		if (number<=100) {
			field=number;
		}else {
			field=100;
		}
	}
	
	public void setField() {
		field=0;
	}
	
}
