import java.util.*;

/*
IRHP = Inverted Rotated Half Pyramid.
    *
   **
  ***
 ****
*****
Make a function to print the following pattern
 */
public class IRHP {
    public static void HalfPyramid(int n){
        System.out.println("Code is in the Function");
        for(int i=1; i<=n; i++){
            // spaces
            for(int j= 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no.:- ");
        int n = sc.nextInt();

        HalfPyramid(n);
    }

}