package test;

import java.util.Scanner;

public class RunningTime {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        int[] toTest = new int[n];
	        
	        for(int i = 0; i<n; i++) {
	        	int tmp = sc.nextInt();
	        	toTest[i] = tmp;
	        }
	        sc.close();
	        
	        for (int t : toTest) {
	        	boolean isPrime=false;
	        	if(t==1) {
	        		System.out.println("Not prime");
	        		isPrime=true;
	        	} 
	        	if(t>1){
	        	for(int i = 2; i<=(double) Math.sqrt(t);i++) {
	        		if(t%i==0) {
	        			System.out.println("Not prime");
	        			isPrime=true;
	        			break;
	        			}
	        		}
	        	}
	        	if(!isPrime) {
	        	System.out.println("Prime");
	        	}
	        }
	        
	    }

}
