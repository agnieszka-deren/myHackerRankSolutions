package advanced;
import java.util.ArrayList;
import java.util.Iterator;

public class LongestSubarray {
	
	
	public static void main(String arg[]) {
		int[] a= {1,2,3,4};
		int k= 4;
		System.out.println(maxLength(a, k));
		
	}

	
	 static int maxLength(int[] a, int k) {
		 	int result=0;
		 	int n = a.length;
		 	ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
		 	int counter=0;
		 	do {
		    for(int i=0; i<n;i++) {	
		    	ArrayList<Integer> temp=new ArrayList<>();
		    		for(int j=i; j<=counter; j++) {
		    			temp.add(a[j]);
		    		}
		    		
		    		System.out.println(temp);
		    		arrList.add(temp);
		    }
		    counter++;
		 	} while(counter != n);
		 	
		 	arrList.remove(null);

		for(int i = 0; i<arrList.size(); i++) {
			ArrayList<Integer> tmp = arrList.get(i);
			Iterator<Integer> number = tmp.iterator();
			Integer sumTmp=0;
			while(number.hasNext()) {
				sumTmp=sumTmp + number.next();
			}
			if(sumTmp<=k) {
				if(tmp.size()>= result) {
					result=tmp.size();
				}
			}
		}    
		    return result;
	 }
}
		    



