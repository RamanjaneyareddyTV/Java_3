package Fridayafternoon;
import java.util.*;

public class main_13 {
    public static void main(String[] arg) 
	 {
	 
      // Sorted integer array array1 which has m elements, 
      // but size of array1 is m+n, sorted integer array array2 which has n elements
	    
  //declaration and instantiation.
        int array1[]=new int[8];
//initialization.
       array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
       int[] array2 = {2,5,7,8};
        System.out.println("\nArray1: "+Arrays.toString(array1));  
	    System.out.println("\nArray2: "+Arrays.toString(array2));
		int m =4, n=4;
		int i = m-1, j = n-1, index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (array1[i] > array2[j]) {
                array1[index--] = array1[i--];
            } else {
                array1[index--] = array2[j--];
            }
        }
        while (i >= 0) {
            array1[index--] = array1[i--];
        }
        while (j >= 0) {
            array1[index--] = array2[j--];
        }
 
    	System.out.println("\nMerged array: "+Arrays.toString(array1));  
	}
    
}
