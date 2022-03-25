package Fridayafternoon;
import java.util.Scanner;

public class main_11 {
    public static void main(String[] arg) 
	 {
	   int x, y ;
	   Scanner in = new Scanner(System.in);	
	   System.out.print("Input first number: ");
	   x = in.nextInt(); 
	   System.out.print("Input second number: ");
	   y = in.nextInt(); 
      while(y != 0){
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        System.out.print("Sum: "+x); 
		System.out.print("\n");     	
	}	
    
}
