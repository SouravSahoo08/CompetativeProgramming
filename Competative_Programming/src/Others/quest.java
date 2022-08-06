package Others;

import java.util.Scanner;

public class quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		changeArray(arr,arr.length);
		for(int i = 0; i< arr.length;i++)
			System.out.println(arr[i]);
	}

	private static void changeArray(int[] arr, int n) {
		int sum = 0;
		for(int i = 0;i<n;i++) {
			sum+=arr[i];
		}
		
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sum - arr[i]; 
		}
	}

}
