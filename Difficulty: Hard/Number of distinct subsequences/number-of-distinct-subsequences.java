//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    int distinctSubsequences(String S) {
        int n = S.length();
        int mod = (int) 1e9 + 7;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        int[] last = new int[26];

        for (int i = 1; i <= n; i++) {
            dp[i] = (dp[i - 1] * 2) % mod;
            if (last[S.charAt(i - 1) - 'a'] != 0) {
                dp[i] = (dp[i] - dp[last[S.charAt(i - 1) - 'a'] - 1] + mod) % mod;
            }
            last[S.charAt(i - 1) - 'a'] = i;
        }
        return (int) dp[n];
    }
}


