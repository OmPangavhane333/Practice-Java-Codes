public class MaximumSubarr {
// Brute Force
    public static void MaxSubArray(int arr[]){
        int c =0;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            int start = i; // 2
            for(int j=i; j<arr.length; j++){
                int end = j; // 2
                c=0;
                for(int k=start; k<=end; k++){
                    // System.out.print(arr[k]+" ");
                    c = c+ arr[k];
                }
                System.out.println("Summation of all Elements of Subarray's:- "+c);
                if(max < c){
                    max = c;
                }
            }
        }
        System.out.println("Max:- " + max);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        MaxSubArray(arr);
    }
}
