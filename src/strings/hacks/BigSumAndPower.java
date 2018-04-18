package strings.hacks;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSumAndPower {


    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
	      BigInteger a = in.nextBigInteger();
	      BigInteger b = in.nextBigInteger();
	      in.close();
	      
	      BigInteger sum = a.add(b);
	      BigInteger power = b.multiply(b);
	      
	      System.out.println(sum);
	      System.out.println(power);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
	
}
