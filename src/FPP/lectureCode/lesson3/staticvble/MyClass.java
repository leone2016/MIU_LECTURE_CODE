package FPP.lectureCode.lesson3.staticvble;


public class MyClass {

	static {
		System.out.println("1. Inside static block");
		printFromStatic();
	}

	static {
		System.out.println("3. by me");

	}

	{
		System.out.println("5. Inside instance initializer block");
	}

	public MyClass() {
		System.out.println("6. Inside constructor");
	}

	static void printFromStatic() {
		System.out.println("2. Inside static method");
	}

	void printFromInstance() {
		System.out.println("7. Inside instance method");
	}

	public static void main(String[] args) {
		System.out.println("4. Inside main method");
		MyClass obj = new MyClass();
		obj.printFromInstance();
	}

	static {
		System.out.println("3.1. abajo del main");

	}
}
