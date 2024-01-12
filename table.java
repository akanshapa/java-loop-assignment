/*Q2. Write a Java program to print a multiplication table for a given number 'n'.  */
package Conditions.Loops;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = num; i<=num*10 ; i+=num){
            System.out.println(i);

        }
         sc.close();
    }
}
