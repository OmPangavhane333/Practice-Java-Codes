import java.util.*;
/*

*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */
public class Butterfly_pattern {

    public static void butterfly(int n){
        for (int i=1; i<=n; i++){  // 1 n= 5
            for (int j=1; j<=i; j++){  // j=1  i =1
                System.out.print("*");
            }
            // space
            for (int k=1; k<=2*(n-i); k++){ // k=8
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n; i>=1; i--){  // 1 n= 5
            for (int j=i; j>=1; j--){  // j=1  i =1
                System.out.print("*");
            }
            // space
            for (int k=1; k<=2*(n-i); k++){ // k=8
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(5);
    }
}
