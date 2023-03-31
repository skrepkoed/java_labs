package lr4;

public class Example_03 {

	public static void main(String[] args) {
		int width=10;
		int [][] rectangle = new int[width][width];
		for(int [] i :rectangle) {
			for(int j=0;j<i.length;j++) {
				i[j]=2;
			}
		}
		for(int []i:rectangle) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
