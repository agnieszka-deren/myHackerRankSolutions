package intro;


import java.util.*;
import java.text.*;


public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getInstance(Locale.US).format(payment).replace("$", "Rs.");
        String china = NumberFormat.getInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}