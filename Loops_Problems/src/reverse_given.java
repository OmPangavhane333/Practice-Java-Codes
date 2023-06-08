import java.util.Scanner;
// reverse the given Number.
public class reverse_given {
    public static void main(String[] args) {
        System.out.println("**** Printing Reverse of a number ****\n\n");
        Scanner sc = new Scanner(System.in);
        int num,n=0;
        System.out.println("Enter The Number:- ");
        num = sc.nextInt();
        int rev = 0;
        while (num >0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        System.out.print("The reverse number is:- "+ rev);

    }
}
