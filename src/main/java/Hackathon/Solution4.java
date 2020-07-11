package Hackathon;
import java.util.Arrays;

public class Solution4 {
    public static int carParkingRoof(int[] arr, int k){
        Arrays.sort(arr);
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        for(int end=0;end<arr.length;end++){
            if(end < k-1) continue;
            int currentLength = arr[end]-arr[start++]+1;
            minLength = Math.min(minLength, currentLength);
        }
        return minLength;
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
