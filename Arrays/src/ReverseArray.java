public class ReverseArray {

    public static void reverse(int arr[]){
        int f = 0, l = arr.length-1;

        while(f<l){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;

            f++;
            l--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print("The Original Array is:- ");
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }

        reverse(arr);

        System.out.print("\nThe Reverse of OG Array is:- ");
        for (int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
