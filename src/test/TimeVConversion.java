package test;
//import java.io.*;
import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class TimeVConversion {


	    static String timeConversion(String s) {
	        char[] result= new char[s.length()-2];
	    	char[] a = s.toCharArray();
	    	
	    	if(a[8] == 'P') {
	    		char[] tmp = new char[2];
	    		tmp[0]=a[0];
	    		tmp[1]=a[1];
	    		String h =new String(tmp);
	    	switch(h) {
	    	case "01":
	    		h="13";
	    		break;
	    	case "02":
	    		h="14";
	    		break;
	    	case "03":
	    		h="15";
	    		break;
	    	case "04":
	    		h="16";
	    		break;
	    	case "05":
	    		h="17";
	    		break;
	    	case "06":
	    		h="18";
	    		break;
	    	case "07":
	    		h="19";
	    		break;
	    	case "08":
	    		h="20";
	    		break;
	    	case "09":
	    		h="21";
	    		break;
	    	case "10":
	    		h="22";
	    		break;
	    	case "11":
	    		h="23";
	    		break;
	    	}
	    	char[] temp=h.toCharArray();
	    	result[0]=temp[0];
	    	result[1]=temp[1];
	    	} else {
	    		if(a[0]=='1' && a[1] =='2') {
	    			result[0]='0';
	    			result[1]='0';
	    		} else {
	    			result[0]=a[0];
	    			result[1]=a[1];
	    		}
	    	}
	    	
	    	for(int i=2; i<result.length; i++) {
	    		result[i]=a[i];
	    	}
	    	
	    	return new String(result);
	    	 	
	    	
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        in.close();
	        String result = timeConversion(s);
	        System.out.println(result);
	    }
	}



