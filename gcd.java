// Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
package Conditions.Loops;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter 1 no. : ");
        int a = sc.nextInt();
        System.out.println("enter 2 no.:");
        int b = sc.nextInt();
        int gcd =1 ;
        int smaller = (a<b) ? a: b;
        for(int i =1; i<=smaller ; i++){
            if(a % i == 0 && b % i ==0){
                gcd= i ;
            }
        }
            System.out.println(gcd);
        
        sc.close();
    }
    
}
