/*Q4. Write a Java program to check if a given string is a palindrome or not using a loop.*/
//we can solve this ques using 
//1.naive approach 2. two pointer appraoch 3.recursion 
package Conditions.Loops;

import java.util.Scanner;

public class palindrome {
    //using 2 pointer approach 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence= sc.nextLine(); // for string , nextLine()is used 
                //palindrome is something which is same from both sides 
         sentence = sentence.toLowerCase(); // converted to lower case 

        int i =0;
        int j = sentence.length()-1;
        while(i<j){
            if(sentence.charAt(i) != sentence.charAt(j)){
                 System.out.print("No");
                 sc.close();
                return; 
            
        }
                    i++;
                j--;
            }
            System.out.println(" yes"); 
             sc.close();
        }
        
    }    












    