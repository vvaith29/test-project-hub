package fundamentals.javaclasses;

public class Evenorodd {

	//both the time and space complexity of your evenOrNot method are O(1). 
	//This means that the method is very efficient in terms of both time and space.
	
	public static void evenOrNot(int num) {
		
		if (num % 2 == 0 ) {
			System.out.println("The given number is even");
		}else {
			System.out.println("The given number is odd");
		}	
	}
	
	public static void main(String[] args) {
		int a = 123;
		evenOrNot(a);

	}

}
