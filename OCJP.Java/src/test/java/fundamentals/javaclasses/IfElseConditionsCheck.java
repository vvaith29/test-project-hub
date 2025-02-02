package fundamentals.javaclasses;

public class IfElseConditionsCheck {

	public static void main(String[] args) {
		
		// find the highest value in 3
		int a = -1100;
		int b= 600;
		int c = 400;
		
		if (a>b & a >c ) {
			System.out.println("a is greater");
		}
		else if (b>a && b >c) {
			System.out.println("b is greater");
		}else {
			System.out.println("C is greater");
		}
		
		
		
	}

}
