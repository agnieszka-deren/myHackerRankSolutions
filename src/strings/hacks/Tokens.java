package strings.hacks;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Tokens {
	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
       
        Pattern p = Pattern.compile("[ !,?._'@]+");

        String[] tokens = p.split(s);
        System.out.println(tokens.length);
        for( String t : tokens){
            System.out.println(t);
        }
  
        scan.close();
    }
	

}
