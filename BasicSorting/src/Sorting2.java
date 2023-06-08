import java.nio.channels.Pipe;

public class Sorting2 {

    public static void SelectionSort(int arr[]){
        int n= arr.length;
        for (int i=0; i<n-1; i++){
            int MinPos = i; // minpos=0
            for(int j=i+1; j<n; j++){ // j=0
                if(arr[MinPos]>arr[j]){
                    MinPos = j;
                }
            }
            // swap
            int temp = arr[MinPos];
            arr[MinPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void Printarr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        SelectionSort(arr);
        Printarr(arr);


    }
}
