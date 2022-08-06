package Others;

import java.util.HashMap;
import java.util.Map;

final class Solution {

	/*
	 * Time Complexity: O(N*log(N)), where N = length of the string passed and it
	 * generally takes O(log(N)) time for an element insertion in a map. Space
	 * Complexity: O(K), where K = size of the map (0<=K<=input_string_length).
	 **/

	public Map<Character, Integer> countDuplicates_UsingMap(String str) {

		Map<Character, Integer> countMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!countMap.containsKey(c))
				countMap.put(c, 1);
			else {
				countMap.put(c, countMap.get(c) + 1);
			}
		}

		return countMap;
	}

	public void print(Map<Character, Integer> count) {

		for (Map.Entry<Character, Integer> m : count.entrySet()) {
			System.out.println(m.getKey() + " : " + m.getValue());
		}

	}

	
	/*
	 * Time Complexity: O(n), where n = length of the string passed Space
	 * Complexity: O(NO_OF_CHARS)
	 * 
	 * Note: Hashing involves the use of an array of fixed size each time no matter
	 * whatever the string is.
	 * 
	 * For example, str = “aaaaaaaaaa”.
	 * 
	 * An array of size 256 is used for str, only 1 block out of total size (256)
	 * will be utilized to store the number of occurrences of ‘a’ in str (i.e
	 * count[‘a’] = 10).
	 * 
	 * Rest 256 – 1 = 255 blocks remain unused.
	 * 
	 * Thus, Space Complexity is potentially high for such cases. So, to avoid any
	 * discrepancies and to improve Space Complexity, maps are generally preferred
	 * over long-sized arrays.
	 */
	
	final int NO_OF_CHARS = 256;

	public void countDuplicates_UsingHashingTecnique(String str) {
		int count[] = new int[NO_OF_CHARS];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		for (int i = 0; i < NO_OF_CHARS; i++) {
			if (count[i] > 1)
				System.out.println((char) i + " : " + count[i]);
		}
	}

}

public class StringDuplicates {

	public static void main(String[] args) {

		String str = "missisippi";
		Solution sol = new Solution();
		sol.print(sol.countDuplicates_UsingMap(str));
		sol.countDuplicates_UsingHashingTecnique(str);

	}

}
