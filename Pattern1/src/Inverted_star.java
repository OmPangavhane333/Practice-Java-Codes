/*
Q. Try to print following pattern with the help of for loop.
    ****
    ***
    **
    *
 */

import java.util.*;
public class Inverted_star {
    public static void main(String[] args) {
        System.out.println("**** Printing Star Pattern ****\n\n");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Number:- ");
        n = sc.nextInt();

        for (int i=n; i>=1; i--){ // i = 4
            for (int j =i; j>=1; j--){ // j = 4
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
