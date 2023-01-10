package lr5;

public class Example_06 {

	public static void main(String[] args) {
		MaxMin obj1 = new MaxMin();
		obj1.setValue(10);
		System.out.println(obj1.getMin());
		System.out.println(obj1.getMax());
		obj1.setValue(-25,35);
		obj1.setValue(-35);
		System.out.println(obj1.getMin());
		System.out.println(obj1.getMax());
	}
}

class MaxMin{
	private int max;
	private int min;
	
	public  void setValue (int number) {
		if (number>max) {
			max=number;
			
		}else if (number<min) {
			min=number;
		}
	}
	
	public void setValue(int number1, int number2) {
		setValue(number1);
		setValue(number2);
	}
	
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}	
}
