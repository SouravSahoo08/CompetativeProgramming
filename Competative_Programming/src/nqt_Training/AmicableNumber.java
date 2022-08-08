package nqt_Training;

import java.util.Scanner;

public class AmicableNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int sum1 = addFactors(n1);
		int sum2 = addFactors(n2);

		if (sum1 == n2 && sum2 == n1)
			System.out.println(n1 + " and " + n2 + " are amicable nos.");
		else
			System.out.println(n1 + " and " + n2 + " are not amicable nos.");
		sc.close();

	}

	private static int addFactors(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {

			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
