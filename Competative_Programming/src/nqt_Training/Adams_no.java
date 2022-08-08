package nqt_Training;

import java.util.Scanner;

public class Adams_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();// 12
		int sq_of_n = n * n; // 144
		int rev_of_n = reverse(n);// 21
		int sq_of_rev_of_n = rev_of_n * rev_of_n;// 441

		if (reverse(sq_of_rev_of_n) == sq_of_n)
			System.out.println(n + " is adam no.");
		else
			System.out.println(n + " is not adam no.");
		sc.close();
	}

	public static int reverse(int n) {
		int rev = 0;
		while (n != 0) {
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		return rev;
	}

}
