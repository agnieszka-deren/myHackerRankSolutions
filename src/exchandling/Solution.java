package exchandling;


import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       try {
    	   int x = sc.nextInt();
    	   int y = sc.nextInt();
    	   System.out.println((int)x/y);
       } catch (InputMismatchException e) {
    	   System.out.println("java.util.InputMismatchException");
       } catch(ArithmeticException a) {
    	   System.out.println("java.lang.ArithmeticException: / by zero");
       }
       sc.close();
       
       
    }
}