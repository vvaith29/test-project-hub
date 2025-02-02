package loopsFundamentals.org;

public class Base1 {

	public static void main(String[] args) {

		// Write a program to print numbers from 1 to 10 using a while loop.

//		int num = 0;
//
//		while (num < 10) {
//			System.out.println(num);
//			num++;
//		}

		// Write a program to find the sum of the digits of a given number using a while
		// loop.
		
			int num =12345;
			int sum =0;
			while (num!=0) {
				
				sum += num %10;
				num = num/10;	
			}
		System.out.println(sum );
		
		

		
		//Write a program to reverse a given number using a while loop.
	
			int nums = 12345;
			int rev =0;
			
			while (nums!=0) {
				
				int digit = nums%10;
				rev = rev*10 + digit;
				nums = nums/10;
				
			}
				System.out.println(rev);
	}

}
