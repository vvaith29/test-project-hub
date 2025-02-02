package fundamentals.javaclasses;

public class PositiveNegativeZero {

	public static void positiveNegative(int num1, int num2, int num3) {

		if ( num1 >0 ) {
			System.out.println("Given number is positive");
		}else if (num2<0) {
			System.out.println("Given number is Negative");
			}
		else {
			System.out.println("No Zeros in it ");
		}
	}
	
	public static void main(String[] args) {
		int a = 25;
		int b = -10;
		int c = 0 ;
		positiveNegative(a,b,c);
			

	}

}
