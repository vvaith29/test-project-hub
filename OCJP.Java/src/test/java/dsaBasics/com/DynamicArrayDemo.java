package dsaBasics.com;

import java.util.*;

public class DynamicArrayDemo {

	static ArrayClass arrclass = new ArrayClass();

	public static void main(String[] args) {
		int pos, value;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the menu details \n");
			System.out.println("1.Insert the value at the end ");
			System.out.println("2.Display te List ");
			System.out.println("3.Insert a value at a position ");
			System.out.println("4.Delete from specifed position");
			System.out.println("5. Exit the case");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Inserting a value to the list");
				value = scanner.nextInt();
				arrclass.addValues(value);
				break;

			case 2:
				System.out.println("Displaying the full list values ");
				arrclass.displayList();
				break;

		case 3: System.out.println("Inserting a value at a position ");
					pos = scanner.nextInt();
					arrclass.inserAt(pos,value);
					
		case 4: System.out.println("Deleting from specifed position");
					pos = scanner.nextInt();
					arrclass.deleteAt(pos);
		case 5: System.out.println("Exiting from the system...");
					System.exit(0);
		
		default : System.out.println(Please enter the valid option to choose from");

			}

		}
	}

}
