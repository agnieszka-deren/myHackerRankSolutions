package advanced;

import java.util.ArrayList;

public class KingOfFrankia {
	public static void main(String[] args) {
	int[] A = {3,1,1,2,2,1,1,2,2,2,3,1};
	Sol res = new Sol();
	int result = res.sol(A);
	System.out.println("ilosc gor i dolin = " + result);
	}
}


class Sol {
	
    public int sol(int[] A) {
      int result = 0;
      int hills = 0;
      int valleys = 0;
      int tmp = A[0];
      
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(tmp);
      for(int i = 1; i<A.length; i++) {
    	  if(tmp != A[i]) {
    		  arr.add(A[i]);
    		  tmp = A[i];
    	  }
      }
     
      if(arr.size()==1) {
    	  return 1;
      } else if (arr.size()==2) {
    	  return 2;
      } else {
      
      for (int i = 1; i<arr.size()-1; i++) {
    	if((arr.get(i-1) < arr.get(i)) && (arr.get(i) > arr.get(i+1))) {
    		hills++;
    	}
    	  
    	if((arr.get(i-1) > arr.get(i)) && (arr.get(i) < arr.get(i+1))) {
    		valleys++;
    	}  
    	System.out.println("i = "+ i + " hills = " + hills + " valleys = " + valleys);
      }
      result = hills + valleys + 2; 
      }
      return result;  
    }
}