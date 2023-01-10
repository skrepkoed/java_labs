package lr4;

public class Example_07 {

	public static void main(String[] args) {
		int[][] snakeArray= new int [3][3];
		int stop=snakeArray[0].length;
		snakeArray[0][snakeArray[0].length-1]=stop;
		int[] counter=new int[2];
		int rowCounter=0;
		int colCounter=snakeArray[0].length-1;
		boolean odd=true;
		int sum=snakeArray[0].length+snakeArray.length-1;
		counter=horizontal(rowCounter, snakeArray, stop, counter[0]);
		counter=vertical(colCounter, snakeArray, counter[0]+1, counter[0]+1);
		rowCounter+=1;
		colCounter-=1;

		while(sum!=snakeArray.length*snakeArray[0].length) {
			if(odd) {
				counter=horizontal(rowCounter, snakeArray,counter[0], counter[0]);
				sum+=counter[1];
				rowCounter+=1;
				odd=false;
			}else {
				counter=vertical(colCounter, snakeArray, counter[0], counter[0]);
				sum+=counter[1];
				colCounter-=1;
				odd=true;
			}
		}
		Example_05.printArray(snakeArray);
	
	}
	public static int[] horizontal(int rowNumber, int[][]array,int stop,int counter){
		int internalCounter=0;
		for(int i=0;i<array[rowNumber].length;i++) {
			if(array[rowNumber][i]==stop) {
				array[rowNumber][i]=stop;
				int[]result={counter,internalCounter};
				return  result;
			}else {
				counter+=1;
				array[rowNumber][i]=counter;
				internalCounter+=1;
			}
		}
		int[]result={counter,internalCounter};
		return result;
	}
	public static int[] vertical(int colNumber, int[][]array,int stop,int counter) {
		int internalCounter=0;
		for(int i=array.length-1;i>=0;i--){
			if(array[i][colNumber]==stop) {
				array[i][colNumber]=stop;
				int[]result={counter,internalCounter};
				return result;
			}else {
				counter+=1;
				array[i][colNumber]=counter;
				internalCounter+=1;
			}
		}
		int[]result={counter,internalCounter};
		return result;
	}

}
