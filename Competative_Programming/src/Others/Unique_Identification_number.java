package Others;

import java.util.Scanner;

public class Unique_Identification_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//String uin = sc.next();
		int x = (char)'9' - (char)'0';
		System.out.println(x);
		//validate_Uin(uin);

	}

	private static void validate_Uin(String uin) {
		char[] uin_char = uin.toCharArray();
		
		for(int i = 0;i<uin_char.length;i+=2) {
			int n = Character.getNumericValue(uin_char[i]);
			int triple = n*3;
			if(triple>9) {
				uin_char[i] = (char) ((char)getSum(triple) - (char)'0'); 
				
			}
		}
		
		
	}

	private static int getSum(int n) {
		
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n/=10;
		}
		return sum;
	}

	
}
