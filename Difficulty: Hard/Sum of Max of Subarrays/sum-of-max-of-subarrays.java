//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            List<Integer> arrList = new ArrayList<>();

            for (int i = 0; i < str.length; i++) {
                arrList.add(Integer.parseInt(str[i]));
            }

            // Convert List<Integer> to int[]
            int[] arr = arrList.stream().mapToInt(Integer::intValue).toArray();

            int ans = new Solution().sumOfMax(arr);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public int sumOfMax(int[] arr) {
        int n = arr.length;
        int res = 0;
        Stack<Integer> stk = new Stack<>();
        int[] left = new int[n], right = new int[n];

        // Finding the left boundary for each element
        for (int i = 0; i < n; ++i) {
            
            // Pop elements smaller than arr[i] from stack
            while (!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                stk.pop();
            }

            // Calculate left boundary count
            left[i] = (stk.isEmpty()) ? (i + 1) : (i - stk.peek());

            // Push current index into stack
            stk.push(i);
        }

        // Clear the stack for right boundary computation
        stk.clear();

        // Finding the right boundary for each element
        for (int i = n - 1; i >= 0; --i) {
            
            // Pop elements smaller or equal to arr[i] from stack
            while (!stk.isEmpty() && arr[stk.peek()] <= arr[i]) {
                stk.pop();
            }

            // Calculate right boundary count
            right[i] = (stk.isEmpty()) ? (n - i) : (stk.peek() - i);

            // Push current index into stack
            stk.push(i);
        }

        // Compute sum of max elements of all subarrays
        for (int i = 0; i < n; ++i) {

            // Contribution of arr[i] as max in subarrays
            res += arr[i] * left[i] * right[i];
        }

        return res;
    }
}