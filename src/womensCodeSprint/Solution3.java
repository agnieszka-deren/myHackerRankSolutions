package womensCodeSprint;

//import java.io.*;
//import java.math.*;
//import java.text.*;
//import java.util.*;
import java.util.regex.*;

public class Solution3 {
	
	
    public static void main(String[] args){

		String g = "ab";
		System.out.println("g ="+ g);
		String c = "aabb";
		System.out.println("c =" + c);
        int result = giftBoxes(g, c);
        
        System.out.println(result);

}

    static int giftBoxes(String g, String c) {
    	
    	int giftNum = 0;
    	System.out.println("gift num = " + giftNum);
    	Pattern pat = Pattern.compile(g);
    	Matcher mat = pat.matcher(c);
    	
    	while(mat.find()) {
    		giftNum++;
    		c = mat.replaceFirst("");
    		System.out.println("c po wymianie " + c);
    		mat = pat.matcher(c);
    	}
    	return giftNum;
    }



}