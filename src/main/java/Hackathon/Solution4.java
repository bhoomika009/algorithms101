package Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {
    public static int carParkingRoof(int[] arr, int k){
        Arrays.sort(arr);
        int start = 0;
        int minRoofLength = Integer.MAX_VALUE;
        for(int end=0;end<arr.length;end++){
            if(end < k-1) continue;
            int currentRoofLength = arr[end]-arr[start++]+1;
            minRoofLength = Math.min(minRoofLength, currentRoofLength);
        }
        return minRoofLength;
    }

    public static void main(String[] args)
    {
        try {
            int[] arr = {2, 10, 8, 17};
            int k = 3;
            System.out.println(carParkingRoof(arr,k));
        }
        catch(Exception e){
            System.out.println("exception occured" + e.getStackTrace());
        }
    }
}
