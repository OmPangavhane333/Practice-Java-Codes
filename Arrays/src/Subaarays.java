public class Subaarays {

    public static void FindSubArray(int arr[]){
        int ts = 0, c =0 , curr=0, max=0;
        for (int i=0; i<arr.length; i++){
            int start = i; // 2
            for(int j=i; j<arr.length; j++){
                int end = j; // 2
                System.out.print("[ ");
                c=0;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                    c = c+ arr[k];
                }
                System.out.print(']');
                System.out.println("Summation of all Elements of Subarray's:- "+c);
                System.out.println("Max:- "+ max);


                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarray's:- "+ ts);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        FindSubArray(arr);


    }
}
