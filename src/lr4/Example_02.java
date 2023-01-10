package lr4;

public class Example_02 {
	public static void main(String[] args) {
		int base = 1;
		int height = 10;
		String triangleString="";
		for(;height>0;height--){
			triangleString+=triangle_row(base);
			base+=1;
		}
		System.out.print(triangleString);
		
		
	}
	public static String triangle_row(int rowLength) {
		String resultString="";
		for(;rowLength>0;rowLength--) {
		resultString+="*";
		}
		resultString+="\n";
		return resultString;
	}
}
