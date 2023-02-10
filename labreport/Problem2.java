package labreport;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        int n, r = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        n = sc.nextInt();
        
        for(int i=n; i>1; i--){
            r = r*i;
        }
        System.out.println("factorial of "+n+" = "+r);
    }
}
