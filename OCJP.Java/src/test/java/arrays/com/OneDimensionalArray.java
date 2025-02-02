package arrays.com;

public class OneDimensionalArray {

	public static void main(String[] args) {

		// declaring One dimensional array or static array
		// declaring in similar objects in each dataType and String Class;
		// To get the Size of an array we can use length method
		// to print the values in an array we go use for loops for it

		// For single dimensional array size is fixed
		// Can declare only similar types to per data type
		// To over come this we have object array in java or dynamic array

		// integer data type
		int[] i = new int[4];
		i[0] = 50;
		i[1] = 100;
		i[2] = 300;
		i[3] = 400;
		System.out.println(i.length);
		System.out.println("**** ");

		// double data type
		double[] a = new double[4];
		a[0] = 23.55;
		a[1] = 34.23;
		a[2] = 45.55;
		a[3] = 55.55;

		System.out.println(a.length);
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);

		}
		System.out.println("**** ");

		// boolean data type

		boolean[] b = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println("**** ");

		// String class

		String[] s = new String[2];
		s[0] = "Vaitheeswaran";
		s[1] = "Dinho";

		System.out.println(s[0]);
		System.out.println(s.length);
		for (int q = 0; q < s.length; q++) {
			System.out.print(s[q] + " ");

		}

	}

}
