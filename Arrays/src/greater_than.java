import java.util.*;

public class greater_than {

    public static int getLargest(int Arr[]){
         int largest= Integer.MIN_VALUE;
         int smallest = Integer.MAX_VALUE;

         for(int i=0; i<Arr.length; i++){
             if(Arr[i]>largest){
                 largest = Arr[i];
             }
             if(Arr[i]<smallest){
                 smallest = Arr[i];
             }
         }
        System.out.println("the smallest value is:- "+ smallest);
         return largest;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers You want to add?? ");
        n = sc.nextInt();
        int Arr[] = new int[n];
        // code for taking input in array and storing in it.
        for (int i = 0; i < n; i++) {
            System.out.println("Enter The Element of " + i + " Position");
            Arr[i] = sc.nextInt();
        }
        System.out.print("Array:- [ ");

        // code for printing the array Elements.
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        System.out.println("The largest Value in array is:- "+getLargest(Arr));
    }
}
