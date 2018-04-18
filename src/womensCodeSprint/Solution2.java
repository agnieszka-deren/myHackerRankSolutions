package womensCodeSprint;


import java.io.*;
//import java.math.*;
//import java.text.*;
import java.util.*;
//import java.util.regex.*;

public class Solution2 {

    /*
     * Complete the uniqueRecycledPairs function below.
     */
    static long uniqueRecycledPairs(int[] A) {
       long result=0;
       HashSet<UniqPairs> uniqPairs = new HashSet<>();
       for(int i = 0; i < A.length; i++) {
    	  int tmp = A[i];
    	  String tmpS = String.valueOf(tmp);
    	  int count = 1;
    	  ArrayList<Integer> changedPlaces = new ArrayList<>();
    	  while(count < tmpS.length()) {
    		  String changedString =tmpS.substring(tmpS.length()-count, tmpS.length())+tmpS.substring(0, tmpS.length()-count);
    		  int changedStrToInt = Integer.parseInt(changedString);
    		  int lookedLength = String.valueOf(changedStrToInt).length();
    		  if(lookedLength == tmpS.length()) {
    		  changedPlaces.add(changedStrToInt);
    		  }
    		  count++;
    	  }  

    	  for(Integer s: changedPlaces) {
    		  if(s<tmp) {
    			  for(int a: A) {
    				  if((s == a)) {
    					  uniqPairs.add(new UniqPairs(tmp, s));  
    				  }
    			  }
    		  }
    	  }
       }
       
       result =uniqPairs.size();          
       return result;
       
    }
  

   

    public static void main(String[] args) throws IOException {

        int[] A = {10,1,13,13,31,15432,32154};
        long result = uniqueRecycledPairs(A);
        System.out.println(result);
        
    }
}

class UniqPairs{
	int largerNum;
	int smalerNum;
	
	public UniqPairs(int l, int s) {
		this.largerNum = l;
		this.smalerNum = s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + largerNum;
		result = prime * result + smalerNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniqPairs other = (UniqPairs) obj;
		if (largerNum != other.largerNum)
			return false;
		if (smalerNum != other.smalerNum)
			return false;
		return true;
	}
		
}