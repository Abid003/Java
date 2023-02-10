package assignment2;

import java.util.Scanner;

public class Factorial {
 
    public static void main(String[] args) {
        int n, a = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        n = sc.nextInt();
        
        for(int i=n; i>1; i--){
            a = a*i;
        }
        
        System.out.println("factorial of given number= " +a);
    }
}
