package lr1;

public class Hyp_with_parameters {
	static double a =10.0, b=4.0, c;
	public static void main(String[] args) {
		System.out.println("katet а=" + a);
		System.out.println("katet b=" + b);
		System.out.println("hypotenuse с=" + hyp(a,b));

	}
	public static double hyp(double a, double b){
		return  Math.sqrt(Math.exp(2*Math.log(a)) + Math.exp(2*Math.log(b)));
		}

}
