package java8.func.intf;

@FunctionalInterface
public interface MyFunctionalInterface {

	void display(String message);

	default void findEven(int number) {
		if (number % 2 == 0) {
			System.out.println("Provided number is EVEN");
		} else {
			System.out.println("Provided number is not EVEN");
		}
	}

	default void countChars(String str) {

	}
}
