/*
Q. Try to print following pattern with the help of for loop.
    ****
    ****
    ****
    ****
 */
import java.util.*;
public class square_pattern {
    public static void main(String[] args) {
        System.out.println("**** Printing Square Pattern ****\n\n");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number:- ");
        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
