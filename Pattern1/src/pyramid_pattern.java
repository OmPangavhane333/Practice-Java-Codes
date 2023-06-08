/*
Problem Statement :- Print following pattern with the help of For loop. (Nested For Loop).

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/

import java.util.*;
public class pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        int count = 1;
        for (int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }
    }
}
