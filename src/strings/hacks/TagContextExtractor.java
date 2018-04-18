package strings.hacks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContextExtractor {

	
	public static void main(String[] args) {
		String html = "<h1>blabla</h1>"; 
		String regex = "<(.+)>([^<]+)</\\1>";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(html);
        
        boolean bool = false;
        
        while(m.find()) {
        	System.out.println(m.group(2));
        	bool = true;
        } 
        if(!bool) {
        	System.out.println("None");
        }
	}
}
