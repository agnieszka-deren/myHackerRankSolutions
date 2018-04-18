package test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {
	public static void main(String[] arg) {
	 Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     
 
     ArrayList<ArrayList<Integer>> arrlist = new ArrayList<>();
     
     for (int i =0; i<n;i++) {
    	 int d=scan.nextInt();
    	 ArrayList<Integer> temp = new ArrayList<>();
    	 for (int j=0; j<d; j++) {
    		 int a = scan.nextInt();
    		 temp.add(a);
    	 }
    	 arrlist.add(temp);    	 
     }
     int q= scan.nextInt();
     for(int i=1;i<=q;i++) {
             int x,y;
             x=scan.nextInt();
             y=scan.nextInt();
             try
             {
               System.out.println(arrlist.get(x-1).get(y-1));
             }catch(Exception e){
                 System.out.println("ERROR!");
             }
     }
     
     scan.close();
     

	}
}
