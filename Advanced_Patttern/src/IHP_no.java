/*
 Inverted Half Pyramid with Numbers.
12345
1234
123
12
1
 */
import java.util.*;
public class IHP_no {
    public static void Half_pyramid_wih_numbers(int n){
        for (int i =1; i<=n;i++){ // i=1
            for(int j=1; j<=n-i+1; j++){ // j = 5
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int n = sc.nextInt();
        Half_pyramid_wih_numbers(n);

    }
}
