package dsaBasics.com;

public class ArrayClass extends DynamicArrayDemo {
	
	private  int arr[];
	private int initialCapcity =16;
	private int size;
	private int capacity;
	
	ArrayClass(){
		arr = new int[initialCapcity];
		size = 0;
		capacity = initialCapcity;
		
	}
	
	public void addValues(int value) {
	
		if (size== capacity) {
			expandArray();
		}
		arr[size] = value;
		size++;
	}
	
	public void displayList() {
		
		for (int i=0; i<size;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

	private void expandArray() {
		capacity *= 2 ;
		arr = java.util.Arrays.copyOf(arr, capacity);
	}

	

	
}
