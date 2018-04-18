package womensCodeSprint;

import java.io.*;
//import java.math.*;
//import java.text.*;
//import java.util.*;
//import java.util.regex.*;

public class Solution1 {

    /*
     * Complete the howMuchToAsk function below.
     */
    static int howMuchToAsk(int c, int p) {
    	
    	int rest = p - c;
    	
    	if(rest == 20 || rest == 50 || rest == 100 || rest == 200 || rest == 500 || rest == 1000) {
   	    return 0;
        }
    	
    	if (rest >=11 && rest <= 19){
    		return 20-rest;
    	}
    	if (rest >= 41  && rest <= 49) {
    		return 50-rest;
    	}
    	if (rest >= 91 && rest <= 99) {
    		return 100-rest;
    	}
    	
    	if (rest >= 191 && rest <= 199) {
    			return 200-rest;
    	}
    	if (rest >= 491 && rest <= 499) {
    				return 500-rest;
    			}
    	if (rest >= 991 && rest <= 999) {
    		return 1000-rest;
    	}
    	              
       return -1;
    }

   

    public static void main(String[] args) throws IOException {
  
            int c = 5;

            int p = 100;

            int result = howMuchToAsk(c, p);

           System.out.println(result);
         
        

        
    }
}