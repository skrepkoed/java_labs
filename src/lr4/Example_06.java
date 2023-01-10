package lr4;
public class Example_06 {

	public static void main(String[] args) {
		int[][] array= Example_05.initialArray(5, 10);
		int[][] newArray=new int [array.length-1][array[0].length-1];
		int rowToDelete=1+(int)(Math.random()*(array.length));
		int colToDelete=1+(int)(Math.random()*(array[0].length));
		for(int i=0; i<newArray.length;i++) {
			if(i>=rowToDelete-1) {
				for(int j=0;j<newArray[0].length;j++) {
					if(j>=colToDelete-1) {
						newArray[i][j]=array[i+1][j+1];
					}else {
						newArray[i][j]=array[i+1][j];	
					}					
				}
			}else {
				for(int j=0;j<newArray[0].length;j++) {
					if(j>=colToDelete-1) {
						newArray[i][j]=array[i][j+1];
					}else {
						newArray[i][j]=array[i][j];	
					}
					
				}
			}
		}
		System.out.println("Row to delete: "+rowToDelete);
		System.out.println("Column to delete: "+colToDelete);
		System.out.println("Initial array");
		Example_05.printArray(array);
		System.out.println();
		System.out.println("Modified array");
		Example_05.printArray(newArray);
	}
}
