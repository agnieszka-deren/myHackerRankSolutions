package test;

import java.util.Scanner;

public class MarsExpeditionSolution {
	   static int marsExploration(String s) {
	        int wrongLetters=0;
	        char[] sToChar =s.toCharArray();
	        for(int i =0; i<s.length()-3; i=i+3) {
	        	if(sToChar[i]!='S') {
	        		wrongLetters++;
	        	}
	        	if(sToChar[i+1]!='0') {
	        		wrongLetters++;
	        	}
	        	if(sToChar[i+2]!='S') {
	        		wrongLetters++;
	        	}
	        }
	        return wrongLetters;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        int result = marsExploration(s);
	        System.out.println(result);
	        in.close();
	    }

}
