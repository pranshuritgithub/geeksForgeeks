//{ Driver Code Starts
// Initial Template for Java

import java.util.*;

public class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            List<Integer> brr = new ArrayList<>();
            List<Integer> crr = new ArrayList<>();

            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }

            String input2 = sc.nextLine();
            Scanner ss2 = new Scanner(input2);
            while (ss2.hasNextInt()) {
                brr.add(ss2.nextInt());
            }

            String input3 = sc.nextLine();
            Scanner ss3 = new Scanner(input3);
            while (ss3.hasNextInt()) {
                crr.add(ss3.nextInt());
            }

            Solution ob = new Solution();
            List<Integer> res = ob.commonElements(arr, brr, crr);

            if (res.size() == 0) System.out.print(-1);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
//Back-end complete function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr, List<Integer> brr,
                                        List<Integer> crr) {
        int n1 = arr.size();
        int n2 = brr.size();
        int n3 = crr.size();

        // Initializing variables i, j, k to track array indices.
        int i = 0, j = 0, k = 0;

        // Initializing list to store common elements.
        List<Integer> res = new ArrayList<>();

        // Initializing variable last to track previous common element.
        int last = Integer.MIN_VALUE;

        // Loop until reach the end of any array.
        while (i < n1 && j < n2 && k < n3) {
            // If current elements in all arrays are equal and not the same as the
            // previous common element.
            if (arr.get(i).equals(brr.get(j)) && arr.get(i).equals(crr.get(k)) &&
                !arr.get(i).equals(last)) {
                // Add common element to the result list.
                res.add(arr.get(i));

                // Update last variable to current common element.
                last = arr.get(i);

                // Move to next elements in all arrays.
                i++;
                j++;
                k++;
            } else if (Collections.min(Arrays.asList(arr.get(i), brr.get(j),
                                                     crr.get(k))) == arr.get(i))
                i++;
            else if (Collections.min(Arrays.asList(arr.get(i), brr.get(j),
                                                   crr.get(k))) == brr.get(j))
                j++;
            else
                k++;
        }

        // Return the result list with common elements.
        return res;
    }
}