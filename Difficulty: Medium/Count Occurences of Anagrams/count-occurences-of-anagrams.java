//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        
        int m = pat.length(); // pattern length
        int n = txt.length(); // text length
        
        int patFreq[] = new int[26];
        int winFreq[] = new int[26];
        int count = 0;
        
        for(int i=0;i<m;i++)
        {
            patFreq[pat.charAt(i) - 'a']++;
            winFreq[txt.charAt(i) - 'a']++;
        }
        if(areEqual(patFreq,winFreq))
        {
            count++;
        }
        for(int i=m;i<n;i++)
        {
            winFreq[txt.charAt(i) - 'a']++;
            winFreq[txt.charAt(i-m) - 'a']--;
            
            if(areEqual(patFreq,winFreq))
            {
                count++;
            }
        }
        return count;
    }
    boolean areEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
