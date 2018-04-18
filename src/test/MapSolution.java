package test;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MapSolution {

	public static void main(String[] args) {
		   Scanner in = new Scanner(System.in);
		      int n=in.nextInt();
		      in.nextLine();
		      
		      HashMap<String, Integer> telBook = new HashMap<>();
		      
		      for(int i=0;i<n;i++)
		      {
		         String name=in.nextLine();
		         int phone=in.nextInt();
		         in.nextLine();
		         telBook.put(name, phone);
		      }
		     
		      while(in.hasNext())
		      {
		         String s=in.nextLine();
		       
		         if (telBook.containsKey(s)) {
		        	 System.out.println(s+"="+telBook.get(s));
		         } else {
		        	 System.out.println("Not found");
		         }
		      }
		     

		      in.close();
	}

}
