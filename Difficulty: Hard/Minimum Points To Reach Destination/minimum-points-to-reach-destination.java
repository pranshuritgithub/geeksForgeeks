//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int points[][] = new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) points[i][j] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.minPoints(points, m, n));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public int minPoints(int points[][], int m, int n) {
        // Create a 2D array to store minimum points needed at each cell
        int dp[][] = new int[m][n];

        // Initialize the bottom-right cell with minimum points needed
        dp[m - 1][n - 1] =
            points[m - 1][n - 1] > 0 ? 1 : Math.abs(points[m - 1][n - 1]) + 1;

        // Calculate minimum points needed for cells in the last row
        for (int i = m - 2; i >= 0; i--)
            dp[i][n - 1] = Math.max(dp[i + 1][n - 1] - points[i][n - 1], 1);

        // Calculate minimum points needed for cells in the last column
        for (int j = n - 2; j >= 0; j--)
            dp[m - 1][j] = Math.max(dp[m - 1][j + 1] - points[m - 1][j], 1);

        // Calculate minimum points needed for remaining cells
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int minPointsOnExit = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(minPointsOnExit - points[i][j], 1);
            }
        }

        // Return minimum points needed at the starting cell
        return dp[0][0];
    }
}