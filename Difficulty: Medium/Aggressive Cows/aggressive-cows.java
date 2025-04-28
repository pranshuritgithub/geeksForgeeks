//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // Sort the stall positions
        Arrays.sort(stalls);

        // Binary search for the largest minimum distance
        int low = 1; // minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0]; // maximum possible distance
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if we can place all cows with at least 'mid' distance
            if (canPlaceCows(stalls, k, mid)) {
                answer = mid; // This distance is possible, try for a larger distance
                low = mid + 1;
            } else {
                high = mid - 1; // This distance is not possible, try smaller distances
            }
        }

        return answer;
    }

    // Helper function to check if we can place 'k' cows with at least 'dist' distance
    private static boolean canPlaceCows(int[] stalls, int k, int dist) {
        int count = 1; // Place the first cow in the first stall
        int lastPosition = stalls[0]; // Position of the last placed cow

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= dist) {
                count++; // Place a cow here
                lastPosition = stalls[i]; // Update the last placed cow's position
            }
            if (count == k) {
                return true; // All cows are placed successfully
            }
        }

        return false; // Unable to place all cows
    }
}