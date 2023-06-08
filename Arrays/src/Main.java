import jdk.dynalink.beans.StaticClass;

import java.util.*;
// Arrays
public class Main {
    public static int LinearSearch(int key, int arr[]){
        for (int i=0; i< arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers You want to add?? ");
        n = sc.nextInt();
        int Arr[] = new int[n];
        // code for taking input in array and storing in it.
        for (int i=0; i<n; i++){
            System.out.println("Enter The Element of "+ i+ " Position");
            Arr[i] = sc.nextInt();
        }
        System.out.print("Array:- [ ");

        // code for printing the array Elements.
        for(int i=0; i<n; i++){
            System.out.print( Arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        // code to find the length of array.
        System.out.println("The Size of the array:- "+ Arr.length);

        // linear search
        System.out.println("Which number you want to search:- ");
        int key = sc.nextInt();
        int search = LinearSearch(key, Arr);

        if (search == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println(key + " is present on index position " + search);
        }
    }
}


