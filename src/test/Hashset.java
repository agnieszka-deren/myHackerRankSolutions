package test;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset {

	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }
	        
	        HashSet<String[]> mainSet = new HashSet<>();
	        
	        for(int j =0; j< t; j++) {
	        String[] pairTemp = {pair_left[j], pair_right[j]};
	        mainSet.add(pairTemp);
	        System.out.println(mainSet.size());
	        }
	        s.close();

	}

}
