package Conditions.Loops;
import java.util.Scanner;
public class sumNaturalNo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println(" Enter a number upto which you want to find the sum:");
         int num = sc.nextInt();
         int sum =0;
         for(int i =1 ; i<=num ; i++){
            sum+=i;   
            
         } System.out.println(sum );
        
         sc.close();
        }
}
