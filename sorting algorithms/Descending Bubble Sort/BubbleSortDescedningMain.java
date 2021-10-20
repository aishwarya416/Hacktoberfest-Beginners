package DescendingOrderBubbleSort;

import java.util.Arrays;
import java.util.*;

public class BubbleSortDescedningMain {
	public static void main(String[] args) {
		        
        int[] number1 = new int[5];
        int inp;
        int i = 0;
        Scanner myscanner = new Scanner (System.in);
        
        System.out.println("Enter");
        
       inp = myscanner.nextInt();
       
       while(inp!=-1) {
    	   number1[i] = inp;
    	   System.out.println("Enter");
    	   inp = myscanner.nextInt();
    	   i++;
       }
       
       myscanner.close();
       
       BubbleSortDescending bubbleSort = new BubbleSortDescending();

       bubbleSort.sort(number1);
       
       System.out.println(Arrays.toString(number1));
    }
}
