package test;

//import java.util.Scanner;
//import java.util.TreeSet;

public class AppleOrangeGame {
	
//    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
//       int appleScore=0;
//       int orangeScore=0;
//       for(int i =0; i<apples.length;i++) {
//    	   if((a-apples[i])>=s &&(a-apples[i])<=t) {
//    		   appleScore++;
//    	   }
//       }
//       for(int i =0; i<oranges.length;i++) {
//    	   if((b-oranges[i])>=s &&(b-oranges[i])<=t) {
//    		   orangeScore++;
//    	   }
//       }
//       System.out.println(appleScore+" "+orangeScore);
//    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int s = in.nextInt();
//        int t = in.nextInt();
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int m = in.nextInt();
//        int n = in.nextInt();
//        int[] apple = new int[m];
//        for(int apple_i = 0; apple_i < m; apple_i++){
//            apple[apple_i] = in.nextInt();
//        }
//        int[] orange = new int[n];
//        for(int orange_i = 0; orange_i < n; orange_i++){
//            orange[orange_i] = in.nextInt();
//        }
//        countApplesAndOranges(s, t, a, b, apple, orange);
//        in.close();
    	 String A="hello";
         String B="world";
        int sum =A.length()+B.length();
         System.out.println(sum);
  
         if(A.compareTo(B)>0){
             System.out.println("Yes");
         } else{
             System.out.println("No");
         }
        String hi="hello";
        System.out.println(hi.substring(0,1).toUpperCase()+hi.substring(1, hi.length())+" "+hi);
    }

}
