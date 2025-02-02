package fundamentals.javaclasses;

//Grade calculator:
//
//Write a program to calculate the grade based on marks. Use the following criteria:
//
//Marks >= 90: Grade A
//
//Marks >= 80: Grade B
//
//Marks >= 70: Grade C
//
//Marks >= 60: Grade D
//
//Marks < 60: Grade F
public class GradeCalculator {

	public static void gradeCalculator(int Marks) {

		if (Marks == 0) {
			System.out.println("No Grades This time ");
		} else if (Marks > 90) {
			System.out.println("It's Grade A");
		} else if (Marks >= 80) {
			System.out.println("It's Grade B");
		} else if (Marks >= 70) {
			System.out.println("It's Grade C");
		} else if (Marks >= 60) {
			System.out.println("It's Grade D");
		} else if (Marks <= 60) {
			System.out.println("It's Grade F");
		}
	}

	public static void main(String[] args) {

		int marks = 91;
		gradeCalculator(marks);
	}

}
