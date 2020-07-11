package Hackathon;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Solution9 {

    static int stockPairs(int arr[], int target)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == target ||
        arr[j] - arr[i] == target) {
                    System.out.println("Pair" + count + "-------" + arr[i] + arr[j]);
                    count++;
                }
    return count;
}

    public static int SumPairs(int[] input, int k){
        Map<Integer, Integer> frequencies = new HashMap<>();
        int pairsCount = 0;

        for(int i=0; i<input.length; i++){
            int value = input[i];
            int complement = k - input[i];

            if(frequencies.containsKey(complement)){
                int freq = frequencies.get(complement) - 1;
                pairsCount++;
                //System.out.println(value + ", " + complement);
                if(freq == 0){
                    frequencies.remove(complement);
                }else{
                    frequencies.put(complement, freq);
                }
            }else{
                if(frequencies.containsKey(value)){
                    frequencies.put(value, frequencies.get(value) + 1);
                }else{
                    frequencies.put(value, 1);
                }
            }
        }
        return pairsCount;
    }
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of elements in serialNumber");
            int num = scan.nextInt();
            int arrayOfSerialNumber[] = new int[num];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < num; i++) {
                arrayOfSerialNumber[i] = scan.nextInt();
            }
            System.out.println("Enter the target");
            int target = scan.nextInt();
         //  System.out.println("no of pairs......."+stockPairs(arrayOfSerialNumber,target));
            System.out.println("no of pairs......."+ SumPairs(arrayOfSerialNumber,target));
        } catch (Exception e) {
            System.out.println("exception occured" + e.getStackTrace());
        }
    }
}
