package assignment2;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n=10;

          int f1= 0,f2= 1;
        for (int i = 0; i < n; i++) {
            System.out.println(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}
