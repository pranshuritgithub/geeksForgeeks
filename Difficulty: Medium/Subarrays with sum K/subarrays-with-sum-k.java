//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            int res = new Solution().countSubarrays(arr, k);

            System.out.print(res);
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int countSubarrays(int[] arr, int k) {
        int count = 0;
        int currSum = 0;
        
        // HashMap to store the frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        
        // Initialize with the prefix sum 0 having one count (important for sum == k from the start)
        prefixSumCount.put(0, 1);
        
        // Traverse the array
        for (int num : arr) {
            // Update the current sum
            currSum += num;
            
            // If (currSum - k) exists in the map, it means we've found a subarray with sum == k
            if (prefixSumCount.containsKey(currSum - k)) {
                count += prefixSumCount.get(currSum - k);
            }
            
            // Update the map with the current sum
            prefixSumCount.put(currSum, prefixSumCount.getOrDefault(currSum, 0) + 1);
        }
        
        return count;
    }
}
