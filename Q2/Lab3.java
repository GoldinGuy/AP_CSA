package Q2;

public class Lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if ((i % 3== 0) || (i % 5== 0)) {
				sum += i;
			}
		}

		System.out
				.println("The sum of all the natural numbers multiplicable by 3 or 5 is "
						+ sum);
	}

}
