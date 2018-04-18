package test;

import java.util.Scanner;

public class MariasRecords {

    static int[] breakingRecords(int[] score) {
       int higher=0;
       int lower=0;
       int tmp=score[0];
       for (int i =1; i<score.length; i++) {
    	   if(score[i]>tmp) {
    		   tmp=score[i];
    	       higher++;
    	   }
       }
       tmp=score[0];
       for (int i =1; i<score.length; i++) {
    	   if(score[i]<tmp) {
    		   tmp=score[i];
    		   lower++;
    	   }
       }
       
       int[] result={higher, lower};
       return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i = 0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int[] result = breakingRecords(score);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }

}
