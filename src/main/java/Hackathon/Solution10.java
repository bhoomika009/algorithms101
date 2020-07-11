package Hackathon;

public class Solution10 {

    static int fact(int n)
    {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Function to calculate ncr
    static int ncr(int n, int r)
    {
        int ncr = fact(n) / (fact(r) * fact(n - r));
        return ncr;
    }

    static int ways(int m, int w, int n, int k)
    {

        int ans = 0;
        while (m >= k) {
            ans += ncr(m, k) * ncr(w, n - k);
            k += 1;
        }

        return ans;
    }

    // Driver code
    public static void main (String[] args) {

        int m, w;
        m = 6;
        w = 2;
        System.out.println( ways(m, w, 3, 1));
    }
}
