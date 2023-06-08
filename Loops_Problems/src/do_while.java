import java.util.*;
public class do_while {
    public static void main(String[] args) {
        System.out.println("**** Do While Loop ****");
        Scanner sc = new Scanner(System.in);
        int i =1;
        do {
            System.out.println("Enter Your Number:- ");
            int n = sc.nextInt();
            if(n%10 == 0){
                System.out.println("The Loop is been Exited Because you enter Multiple of 10.");
                break;
            }
            System.out.println(n);
        }
        while (true);
    }
}
