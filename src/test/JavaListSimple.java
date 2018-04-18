package test;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaListSimple {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     int n = scan.nextInt();
	     
	     ArrayList<Integer> arr = new ArrayList<>();
	     for (int i = 0; i<n;i++) {
	    	 int a = scan.nextInt();
	    	 arr.add(a);
	     }
	     
	     int q = scan.nextInt();
	     
	     for(int j = 0; j<q; j++) {
	    	 scan.nextLine();
	    	 String query = scan.nextLine();
	    	 if("Insert".equals(query)) {
	    		 int index = scan.nextInt();
	    		 int element = scan.nextInt();
	    		 arr.add(index, element);
	    	 }
	    	 if ("Delete".equals(query)) {
	    		 int index = scan.nextInt();
	    		 arr.remove(index);
	    	 }
	     }
	     
	     
	      for(Integer itx: arr) {
	    	  System.out.print(itx +" ");
	      }
	      scan.close();

	}

}
