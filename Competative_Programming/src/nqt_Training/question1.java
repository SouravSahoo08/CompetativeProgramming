package nqt_Training;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int order = sc.nextInt();
		int N = 10, k=5;
		
		if(order > N || order <=0 || order>k) {
			System.out.println("INVALID INPUT");
			System.out.println("NUMBER OF CANDIES LEFT :" + N);
		}
		else if(order<k && order<=N) {
			System.out.println("NUMBER OF CANDIES SOLD : " + order);
			N-=order;
			System.out.println("No. of candies left :" + N);
		}
		
	}

}
