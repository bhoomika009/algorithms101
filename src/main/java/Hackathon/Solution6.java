package Hackathon;

import java.util.Arrays;

public class Solution6 {
    public static void main(String[] args) {
        int n = 6;
    //    int[] ratings = {4, 2, 5, 1};

        int[] ratings = { 2, 4, 5, 3, 7, 8};
    System.out.println(minimizeBias(ratings));
    }

    static int minimizeBias(int[] ratings){
        int biasAmount=0;
        Arrays.sort(ratings);
        for(int i=0;i<ratings.length;i=i+2){
            biasAmount+=ratings[i+1]-ratings[i];
        }
        return biasAmount;

    }
}