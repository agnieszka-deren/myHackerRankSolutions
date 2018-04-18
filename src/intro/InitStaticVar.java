package intro;

import java.util.Scanner;

public class InitStaticVar {
    
    static Scanner sc = new Scanner(System.in);
    private static int initB() {
    	return sc.nextInt();
    }
    private static int initH() {
    	return sc.nextInt();
    }
    
    static int B = initB();
    static int H = initH();
    
    private static boolean initializeClassVariable() {
        if(B>0 && H>0){
            return true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        return false; 
    }
    public static boolean flag = initializeClassVariable();
    
    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}


    
}
