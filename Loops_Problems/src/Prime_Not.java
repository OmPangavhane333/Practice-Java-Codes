import java.util.*;
public class Prime_Not {
    public static void main(String[] args) {
        System.out.println("**** Check The Given Number is Prime Or Not ****\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number.");
        int n = sc.nextInt();

        if(n == 2){
            System.out.println("Number is Prime.");
        }
        else {
            boolean isPrime = true;
            for (int i =2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("Number is Prime.");
            }
            else {
                System.out.println("Number is Not Prime.");
            }
        }

    }
}
