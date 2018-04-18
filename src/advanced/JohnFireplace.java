package advanced;

import java.util.Arrays;

public class JohnFireplace {

	public static void main(String[] args) {
		int[] T = {-5,-5,-5,-42,6,12};
		Solution res = new Solution();
		int result = res.solution(T);
		System.out.println("najkrótsza mo¿liwa zima to " + result);
	
	}
}

class Solution{

	  public int solution(int[] T) {
		 int result = 0;
		 
		 for(int i= 0; i<T.length-1; i++) {
			 // winter time
			 int[] winter = new int[i+1];
			 for(int j = 0; j<i+1; j++) {
				 winter[j] = T[j];
				 System.out.println("winter "+j+" = "+winter[j]);
			 }
			 // max winter temperature should be smaller then min summer temperature 
			 Arrays.sort(winter);
			 int maxTempWinter = winter[winter.length-1];
			 
			 System.out.println("Dla" + i +" podtablicy winter Temp max " + maxTempWinter);
			 // summer time
			 int[] summer = new int[T.length-i-1];
			 for(int j = 0; j<T.length-i-1; j++) {
				 summer[j] = T[T.length-j-1];
				 System.out.println("summer "+ j + " = " +summer[j]);
			 }
			 // finding minimum summer temperature
			 Arrays.sort(summer);
			 int minTempSummer = summer[0];
			 System.out.println("Dla" + i +" podtablicy summer Temp min = " + minTempSummer);	 
			 
			 if(maxTempWinter < minTempSummer) {
				 result=i+1;
				 break;
			 }	 
			 
		 }
		
		 return result; 
	    }
}