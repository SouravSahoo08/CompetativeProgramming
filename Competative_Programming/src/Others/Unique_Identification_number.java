package Others;

import java.util.Scanner;

public class Unique_Identification_number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * int x = 9; System.out.println(Character.forDigit(x, 10));
		 */

		String uin = sc.next();
		System.out.println(validate_Uin(uin));

	}

	private static boolean validate_Uin(String uin) {
		char[] uin_char = uin.toCharArray();

		for (int i = 0; i < uin_char.length; i += 2) {
			int n = Character.getNumericValue(uin_char[i]);
			int triple = n * 3;
			if (triple > 9) {
				uin_char[i] = Character.forDigit(getSum(triple), 10);
			} else {
				uin_char[i] = Character.forDigit(triple, 10);
			}
		}

		int sum = 0;
		for (char i : uin_char) {
			sum += Character.getNumericValue(i);
		}

		if (sum % 10 == 0)
			return true;
		return false;
	}

	private static int getSum(int n) {

		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}
