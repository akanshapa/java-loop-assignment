/*Q5. Write a Java program to generate and print the first 'n' terms of the Fibonacci series.*/
package Conditions.Loops;
//fibonacci : 0 1 1 2 3 5 8 .....

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int first=0; 
        int second = 1;
        for(int i = 0 ; i<num ; i++){
            System.out.print (first +" ");
    
        //use swaping in fibonaaci 
          /*Initially, firstTerm and secondTerm represent the first two terms (0 and 1).
        In the first iteration, nextTerm becomes the sum of the current firstTerm and secondTerm.
        firstTerm is updated to the current value of secondTerm.
        secondTerm is updated to the calculated nextTerm. */
        int next = first  + second ; 
        first = second;
        second= next;
        }
        sc.close();
        
    }
    
}
