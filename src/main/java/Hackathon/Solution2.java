package Hackathon;

public class Solution2 {
    public static void main(String[] args) {

        int n = 10;
//        int[] start = {1, 2, 5, 8};
//        int[] finish = {2, 2, 6, 10};
        int[] start = {3, 8};
        int[] finish = {4, 9};
        System.out.println(widestGap(n,start,finish));
    }

    private static int widestGap(int n, int[] start, int[] finish){
        int gap = 0;
        int m = start.length;
        boolean[] array = new boolean[n];
        for(int k =0; k<=m-1;k++) {
            for (int j = start[k]-1; j < finish[k]-1; j++) {
                array[j] = true;
            }
        }
        gap=getMaxLength(array);
        return gap;
    }
    static int getMaxLength(boolean arr[])
    {

        int count = 0;
        int result = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {

            if (arr[i] == true)
                count = 0;
            else
            {
                count++;
                result = Math.max(result, count);
            }
        }

        return result;
    }
}
