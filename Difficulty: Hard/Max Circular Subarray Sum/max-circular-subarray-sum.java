//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
       
        int n = arr.length;
        int currmax = arr[0];
        int maxSum = Integer.MIN_VALUE;
        int currmin = arr[0];
        int minSum = arr[0];
        int total = arr[0];
        
        for(int i=1;i<n;i++)
        {
            currmax = Math.max(arr[i],arr[i] + currmax);
            maxSum = Math.max(maxSum,currmax);
            currmin = Math.min(arr[i],arr[i] + currmin);
            minSum = Math.min(minSum,currmin);
            total += arr[i];
        }
        if(maxSum < 0)
        {
            return maxSum;
        }
        
        return Math.max(maxSum, total - minSum);
    }
}
