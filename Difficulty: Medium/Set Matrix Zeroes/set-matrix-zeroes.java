//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new Solution().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        boolean zeroRow[] = new boolean[rows];
        boolean zeroCol[] = new boolean[cols];
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(mat[i][j] == 0)
                {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(zeroRow[i] || zeroCol[j])
                {
                    mat[i][j] = 0;
                }
            }
        }
    }
}