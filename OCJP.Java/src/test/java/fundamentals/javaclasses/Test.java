package fundamentals.javaclasses;


public class Test {

	Test() {
		System.out.println("This is constructor calling :");
	}

	public void method1() {
		System.out.println("This is public method ");
	}

	static {
		System.out.println("This is an static block");
	}

	{
		System.out.println("This is an instance block");
	}

	public static void main(String[] args) {
		System.out.println("This is an main method ");
		Test test = new Test();
		test.method1();

	}

}
