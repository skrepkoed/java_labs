package lr4;

public class Example_04 {

	public static void main(String[] args) {
		int height=4;
		int[][] triangleArray=new int[height][height];
		for(int i=0;i<triangleArray.length;i++) {
			for(int j=0; j<i+1;j++) {
				triangleArray[i][j]=1;
			}
		}
		for(int []i:triangleArray) {
			for(int j:i) {
				if (j==1) {
					System.out.print(j);
				}
			}
			System.out.println();
		}	
	}
}
