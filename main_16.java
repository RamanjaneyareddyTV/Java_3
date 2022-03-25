package Fridayafternoon;
import java.util.*;
public class main_16 {
    public static void main(String[] args)
    {
           for (int i = 1; i <= 100; i++) {
               if (i % 3 == 0 && i % 5 == 0) {
                   System.out.printf("\n%d: fizz buzz",i);
               } else if (i % 5 == 0) {
                   System.out.printf("\n%d: buzz",i);
               } else if (i % 3 == 0) {
                   System.out.printf("\n%d: fizz",i);
               } 
           }
           System.out.printf("\n");
    }
}