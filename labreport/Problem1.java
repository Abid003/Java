package labreport;
import java.util.Scanner;
public class Problem1 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        n = sc.nextInt();
        System.out.println("first "+n+" fibonacchi numbers are: ");
     
            int f1= 0,f2= 1;
        for (int i = 0; i < n; i++) {
            System.out.println(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }
    }
}
