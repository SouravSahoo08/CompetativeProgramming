package Others;

import java.util.Scanner;

public class String_Challenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(StringChallenge_2(str1, str2));
		sc.close();
	}

	private static boolean StringChallenge(String s, String t) {

		if (s.length() != t.length())
			return false;

		int[] alphabet = new int[26];
		for (char c : s.toCharArray())
			try {
				alphabet[c - 'a']++;
			} catch (Exception e) {
				return false;
			}
		for (char c : t.toCharArray())
			try {
				alphabet[c - 'a']--;
			} catch (Exception e) {
				return false;
			}
		for (int i : alphabet) {
			if (i != 0)
				return false;
		}
		return true;
	}
	
	private static boolean StringChallenge_2(String str1, String str2) {

		int[] alpha = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			try {
				alpha[str1.charAt(i) - 'a']++;
			} catch (Exception e) {

				return false;
			}
		}

		for (int i = 0; i < str2.length(); i++) {
			try {
				alpha[str1.charAt(i) - 'a']--;
			} catch (Exception e) {

				return false;
			}
		}

		for (int element : alpha) {
			if (element != 0)
				return false;
		}
		return false;
	}
}

