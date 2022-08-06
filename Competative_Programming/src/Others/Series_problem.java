package Others;

import java.util.Scanner;

public class Series_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String str = String.valueOf(n);
		char[] cnum = str.toCharArray();
		
		for(int i = 0;i<cnum.length;i+=2) {
			if(i == cnum.length-1)
				break;
			
			char temp = cnum[i+1];
			cnum[i+1]=cnum[i];
			cnum[i] = temp;
			
			
		}
		
		System.out.println(cnum);
	}

}
 