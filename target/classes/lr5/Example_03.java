package lr5;

public class Example_03 {

	public static void main(String[] args) {
		IntFields obj1= new IntFields();
		IntFields obj2= new IntFields(1);
		IntFields obj3= new IntFields(2,3);
		System.out.println(obj1);
		System.out.println(obj2.getField1());
		System.out.println(obj3.getField1()+" "+obj3.getField2());
		
	}

}

class IntFields{
	
	private int field1;
	private int field2;
	
	public int getField1() {
		return field1;
	}
	
	public int getField2() {
		return field2;
	}
	
	public IntFields(int field1, int field2) {
		this.field1=field1;
		this.field2=field2;
	}
	
	public IntFields(int field1) {
		this.field1=field1;
	}
	
	public IntFields() {
		
	}
}
