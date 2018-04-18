package test;

import java.util.Scanner;

public class HackerRank {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] words = new String[n];
		for(int i = 0; i<n; i++) {
			words[i] = sc.nextLine();
		}
		
		
		for(int i = 0; i<n; i++) {
			char[] arr=words[i].toCharArray();
			for(int j = 0; j<arr.length;j=j+2) {
				System.out.print(arr[j]);
			}
			System.out.print(" ");
			for(int j=1;j<arr.length; j=j+2) {
				System.out.print(arr[j]);
			}
			System.out.println();	
		}
		
		
		
		sc.close();
		
	}
	
}
