package arrays.com;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] arr = new int[3][4];

		arr[0][0] = 3;
		arr[0][1] = 4;
		arr[0][2] = 5;
		arr[0][3] = 6;
		
//		System.out.print(arr.length);
//		System.out.print(arr[0].length);

		for (int i = 0; i < arr.length; i++) {
			for(int j=0;j<arr[0].length;j++) {

			System.out.println(arr[i][j]);
		}
		}
	}

}
