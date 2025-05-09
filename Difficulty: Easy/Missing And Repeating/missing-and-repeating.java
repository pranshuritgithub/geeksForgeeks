//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList; // Import ArrayList
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String input = br.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // Get the result as an ArrayList<Integer>
            ArrayList<Integer> ans = new Solution().findTwoElement(arr);
            System.out.println(ans.get(0) + " " + ans.get(1));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        long sum = (long) n * (n + 1) / 2;
        long sumSq = (long) n * (n + 1) * (2 * n + 1) / 6;

        long actualSum = 0, actualSq = 0;
        for (int num : arr) {
            actualSum += num;
            actualSq += (long) num * num;
        }

        long diff = actualSum - sum; // x - y
        long sqDiff = actualSq - sumSq; // x^2 - y^2 = (x - y)(x + y)

        long sumXY = sqDiff / diff; // x + y

        long x = (diff + sumXY) / 2;
        long y = x - diff;

        ArrayList<Integer> result = new ArrayList<>();
        result.add((int) x); // Repeating
        result.add((int) y); // Missing

        return result;
    }
}
