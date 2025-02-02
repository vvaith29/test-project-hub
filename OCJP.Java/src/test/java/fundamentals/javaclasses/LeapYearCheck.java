package fundamentals.javaclasses;

public class LeapYearCheck {

	public static void leapYears(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("it's a leap year");
		} else {
			System.out.println("Not a leap year");
		}

	}

	public static void main(String[] args) {
		int year = 1900;
		leapYears(year);
	}

}
