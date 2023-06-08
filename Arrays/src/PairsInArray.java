public class PairsInArray {

    public static void Findpairs(int arr[]){
        int tp =0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i]; // curr 2,4,6,8,10
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+ curr +"," +arr[j]+")" );
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Number Of pairs:- "+tp);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println("Pairs of Elements with Each Other of given Array elements:- ");
        Findpairs(arr);

    }
}
