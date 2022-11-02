package lr4;

public class Example_05 {

	public static void main(String[] args) {
		int [][]rectangle;
		rectangle=initialArray(5, 10);
		System.out.println("Initial array: ");
		printArray(rectangle);
		System.out.println("Inverted array: ");
		System.out.println();
		printArray(invertArray(rectangle));
		
		
	}
	public static int[][] initialArray(int width, int height) {
		int [][] rectangle = new int[width][height];
		for(int [] i :rectangle) {
			for(int j=0;j<i.length;j++) {
				i[j]=(int)(Math.random()*9)+1;
			}
		}
		return rectangle;	
	}
	public static int[][] invertArray(int[][]rectangle) {
		int [][] invertedArray = new int [rectangle[0].length] [rectangle.length];
		for(int i=0;i<invertedArray.length;i++) {	
			for(int j=0;j<invertedArray[i].length;j++) {
				invertedArray[i][j]=rectangle[j][i];
			}
		}	
		return invertedArray;
	}
	public static void printArray(int rectangle[][]) {
		for(int []i:rectangle) {
			for(int j:i) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
