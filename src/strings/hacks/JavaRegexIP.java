package strings.hacks;

import java.util.Scanner;

public class JavaRegexIP {
	
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }
}

class MyRegex {
	String fromZeroToEnd = "([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
	String pattern = fromZeroToEnd +"\\." + fromZeroToEnd + "\\."+ fromZeroToEnd + "\\."+ fromZeroToEnd;

}
