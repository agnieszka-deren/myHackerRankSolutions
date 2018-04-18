package test;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // Declare array a here
        int[] a = new int[n];
      
        for(int i = 0 ; i < n; i++){
        int val = scan.nextInt();
        a[i]=val; 	
        }
        scan.close();
        
        int minusSum = 0;
        
        for(int i =0; i<n;i++) {
        	for(int j = i; j<n; j++) {
        			int sum=0;
        			for(int k = i; k<=j; k++) {
        				sum=sum+a[k];
        			}
        			if (sum<0) {
        				minusSum++;
        			}
        	}
        }
        System.out.println(minusSum);
        
        

       
		

	}

}
