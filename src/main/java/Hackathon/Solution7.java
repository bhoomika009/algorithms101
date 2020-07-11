package Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Solution7 {

    private static int[] counts(int teamA[],int teamB[]){
        int[] result = new int[teamB.length];
        sort(teamA, 0, teamA.length-1);
        for(int i= 0;i<teamB.length;i++) {
                result[i] = binarySearchCount(teamA,teamA.length,teamB[i]);
        }
        return result;
    }

    static int binarySearchCount(int arr[], int n, int key)
    {
        int left = 0, right = n;

        int mid = 0;
        while (left < right) {
            mid = (right + left) >> 1;
            if (arr[mid] == key) {
                while (mid + 1 < n && arr[mid + 1] == key)
                    mid++;
                break;
            }

            else if (arr[mid] > key)
                right = mid;

            else
                left = mid + 1;
        }

        while (mid > -1 && arr[mid] > key)
            mid--;
        return mid + 1;
    }
    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int part = partition(arr, low, high);
            sort(arr, low, part-1);
            sort(arr, part+1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the count for team A");
            int countTeamA = scan.nextInt();
            int teamA[] = new int[countTeamA];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < countTeamA; i++) {
                teamA[i] = scan.nextInt();
            }
            System.out.println("Enter the count for team B");
            int countTeamB = scan.nextInt();
            int teamB[] = new int[countTeamB];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < countTeamB; i++) {
                teamB[i] = scan.nextInt();
            }

            int[] result = counts(teamA,teamB);
            System.out.println(Arrays.toString(result));

    }
}
