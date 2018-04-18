package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConBook {

	
	public static void main(String[] args) {
		String binaryString="0101101100011010";
		String regex ="[01]";
		Pattern g = Pattern.compile(regex);
		Matcher m = g.matcher(binaryString);
		if(m.matches()) {
			System.out.println(binaryString);
		}
		
		

	}
	
}

