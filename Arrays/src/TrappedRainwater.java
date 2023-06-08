import java.util.*;
public class TrappedRainwater {

    public static int trapped_rainwater(int height[]){

        int TW=0,WL;
        int n = height.length;  // n = 7

        // calculate LMB
        int LMB[] = new int[n]; // created new array of size n.
        LMB[0]=height[0]; // LMB[0] = 4 because height[0] = 4.

        for(int i=1; i<n; i++){
            LMB[i]=Math.max(height[i], LMB[i-1]);  //for i=1  LMB[1] maximum(2,4) = 4
                                                   //for i=2  LMB[2] maximum(0,4) = 4 so on
        }

        // Calculate RMB
        int RMB[] = new int[n]; // created new array of size n.
        RMB[n-1]= height[n-1];  // RMB[6] = 5 because height[6] = 5

        for (int i=n-2;i>=0; i--){
            RMB[i] = Math.max(height[i],RMB[i+1]); // for i = 5 RMB[5] maximum(2,5) = 5
                                                   // for i = 4 RMB[4] maximum(3,5) = 5
                                                   // for i = 3 RMB[3] max(6,5)   = 6
        }

        // loop
        for(int i=0; i<n; i++){

            // WL = min(LMB,RMB) WL is nothing but WaterLevel.
            WL = Math.min(LMB[i], RMB[i]);  // for i=0 WL = minimum(4,6) = 4
                                            // for i=1 WL = min(4,6) = 4

            // TW = WL - height[i]
            TW += WL - height[i];  // for i=0 TW = 4 - 4 = 0
                                   // for i=1 TW = 4 - 2 = 2 so on....
        }
        return TW;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("All Rights Reserved>>!!! BY Mr. Om pangavhane");
        System.out.println("Total Trapped water in bars:- "+ trapped_rainwater(height));
    }
}
