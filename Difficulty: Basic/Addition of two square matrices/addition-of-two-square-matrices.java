// User function Template for Java

class Solution {
    public void Addition(int[][] a, int[][] b) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] + b[i][j];
            }
        }
    }
}
