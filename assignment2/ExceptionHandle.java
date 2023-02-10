package assignment2;

import java.util.Scanner;

public class ExceptionHandle {

    public static void main(String[] args) {
        int n1, n2, res;
        int a[] = new int[10];

        try {
            a[12] = 30;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("out of size");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 number");
        n1 = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        n2 = sc.nextInt();

        try {
            res = n1 / n2;
            System.out.println("divition = " + res);
        } catch (Exception e) {
            System.out.println("divide by zero impossible");
        }

    }

}
