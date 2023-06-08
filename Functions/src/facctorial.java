import java.util.*;
public class facctorial {
    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:- ");
        int n = sc.nextInt();

        System.out.print("The factorial of the number is:- " + factorial(n));

    }
}
