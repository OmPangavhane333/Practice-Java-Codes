import java.util.Scanner;
// Print the reverse number.
public class reverse {
    public static void main(String[] args) {
        System.out.println("**** Printing Reverse of a number ****\n\n");
        Scanner sc = new Scanner(System.in);
        int num,n=0;
        System.out.println("Enter The Number:- ");
        num = sc.nextInt();

        while (num >0){
             int lastDigit = num % 10;
            System.out.print(lastDigit);
             num = num / 10;
        }

    }
}
