package Others;

import java.util.Scanner;

public class quest {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		changeArray(arr,arr.length);
		for(int i = 0; i< arr.length;i++)
			System.out.println(arr[i]);
	}

	private static void changeArray(int[] arr, int n) {
		for(int i = 0;i<arr.length;i++) {
			arr[i] = 150 - arr[i]; 
		}
	}

}
