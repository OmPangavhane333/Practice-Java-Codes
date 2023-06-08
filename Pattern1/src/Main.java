/*
Q. Try to print following pattern with the help of for loop.
    *
    **
    ***
    ****
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("**** Printing Star Pattern ****\n\n");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number:- ");
        n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
