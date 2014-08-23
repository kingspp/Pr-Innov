import java.util.Scanner;

public class azby {

	public static void main(String v[]) {
		double start = System.nanoTime();
		String input;
		int a = 0;
		System.out.println("A-Z -- B-Y");
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		input = input.toUpperCase();

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 32) {
				System.out.print(" ");
			} else {
				a = 90 - input.charAt(i);
				System.out.print((char) (65 + a));
			}
		}
		System.out.println("");

		double end = System.nanoTime();
		System.out.println("Time Elapsed is: " + String.valueOf((end - start))
				+ "ns");
	}
}
