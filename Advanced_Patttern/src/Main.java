import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;

        System.out.println("Enter no. of rows:- ");
        rows = sc.nextInt();

        System.out.println("Enter no. of rows:- ");
        cols = sc.nextInt();

        for(int i=1; i<=rows; i++){
            for (int j=1; j<=cols; j++){
                if(i == 1 || i == rows || j==1 || j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}