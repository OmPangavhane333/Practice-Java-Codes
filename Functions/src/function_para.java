import java.util.*;
public class function_para {

    public static void add(int a, int b){  // parameters or formal parameters
        int c = a+b;
        System.out.println("The Sum is:- " + c);
    }
    public static void main(String[] args) {
        System.out.println("Code to learn Parameterized Function.");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        add(a, b);  // Arguments or actual parameters.

    }
}
