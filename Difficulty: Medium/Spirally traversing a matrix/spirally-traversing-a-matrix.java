//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int minRow = 0;
        int maxRow = mat.length-1;
        int minCol = 0;
        int maxCol = mat[0].length-1;
        int total = mat.length * mat[0].length;
        
        while(true)
        {
            for(int i=minCol;i<=maxCol;i++)
            {
                list.add(mat[minRow][i]);
            }
            minRow++;
            
            if(list.size() >= total)
            {
                break;
            }
            
            for(int i=minRow;i<=maxRow;i++)
            {
                list.add(mat[i][maxCol]);
            }
            maxCol--;
            
             if(list.size() >= total)
            {
                break;
            }
            
            for(int i=maxCol;i>=minCol;i--)
            {
                list.add(mat[maxRow][i]);
            }
            maxRow--;
            
             if(list.size() >= total)
            {
                break;
            }
            
            for(int i=maxRow;i>=minRow;i--)
            {
                list.add(mat[i][minCol]);
            }
            minCol++;
            
             if(list.size() >= total)
            {
                break;
            }
            
        }
        return list;
    }
}
