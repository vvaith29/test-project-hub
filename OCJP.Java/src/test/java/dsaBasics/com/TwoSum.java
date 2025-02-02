package dsaBasics.com;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static int[] numSum(int num[], int target) {

		HashMap<Integer, Integer> chMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < num.length; i++) {
			int digit = target - num[i];
			if (chMap.containsKey(digit)) {
				return new int[] { chMap.get(digit), i };
			} else {
				chMap.put(num[i], i);
			}

		}
		return null;

	}

	public static void main(String[] args) {
		int[] num = { 2, 3, 11, 15,7 };
		int target = 9;
		int[] result = numSum(num, target);

		System.out.println(Arrays.toString(result));

	}

}
