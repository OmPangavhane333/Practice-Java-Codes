public class MaximumSubarr2 {
    // Prefix Subarray
    public static void maxSubarray(int arr[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        // calculate prefix array
        for(int i=1; i<prefix.length; i++){
          prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i=0; i<arr.length; i++){
            int start = i;
            for (int j=0; j<arr.length; j++){
                int end = j;

                currSum = start==0? prefix[end] :   prefix[end] - prefix[start-1];

                if(MaxSum< currSum){
                    MaxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum =:- "+ MaxSum);
    }

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max Subarray sum is:- "+ms);

    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubarray(arr);
        kadanes(arr);
    }
}
