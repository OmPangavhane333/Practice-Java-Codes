/*
Problem Statement:- Write a function to Find Binomial Coefficient i.e nCr.
 */


import java.util.*;
public class binomialCoefficient {
    public static int factorial(int n) {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static int binomial(int n, int r){
        int ncr;
        ncr = factorial(n) / (factorial(r) * factorial(n-r));

        return ncr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**** Program to Find Binomial Coefficient i.e nCr. ****\n");
        System.out.println("Enter The Value of n:- ");
        int n = sc.nextInt();

        System.out.println("Enter The Value of n:- ");
        int r = sc.nextInt();

        int BC = binomial(n, r);
        System.out.println("The Value of NCR is:- "+ BC);
    }
}
