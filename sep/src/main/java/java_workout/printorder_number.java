package java_workout;

public class printorder_number {

	public static void main(String[] args) {
		int a = 11;

		if (a % 2 == 1) {
			System.out.println("odd number");
		} else {
			System.out.println("even number");
		}

		int b = 11;
		for (int c = 1; c <= b; c++) {
			if (c % 2 != 0) {
				System.out.println(c + " odd number");
			}
		}
	}

}
