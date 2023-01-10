package lr4;

public class Example_01 {

	public static void main(String[] args) {	
		for(int rows = 11; rows>0; rows--) {
			for(int cols = 23; cols>0;cols--) {
				if (rows==1||rows==11) {
					System.out.print("*");
				}else  {
					if (cols==1||cols==23) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}	
			}
		System.out.println("");
		}
	}
}
