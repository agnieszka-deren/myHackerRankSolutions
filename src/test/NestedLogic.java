package test;

import java.util.Scanner;

public class NestedLogic {
	
	 public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int dayAct = sc.nextInt();
	       int monthAct = sc.nextInt();
	       int yearAct = sc.nextInt();
	       int dayExp = sc.nextInt();
	       int monthExp = sc.nextInt();
	       int yearExp = sc.nextInt();
	       sc.close();
	       int fine=0;
	       
	       if(yearAct == yearExp) {
	    	   if (monthAct == monthExp) {
	    		   if(dayAct<=dayExp) {
	    			   fine=0;
	    		   } else {
	    			   fine=(dayAct-dayExp)*15;
	    		   }
	    	   } else if(monthAct<monthExp) {
	    		   fine=0;
	    	   } else {
	    		   fine=(monthAct-monthExp)*500;
	    	   }
	    	   
	       } else if (yearAct>yearExp) {
	    	   fine = fine+10000;
	       } else {
	    	   fine=0;
	       }
	       
	       System.out.println(fine);
	       
	    }

}
