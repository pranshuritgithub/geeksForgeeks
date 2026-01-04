class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0)
            return 0;

        Arrays.sort(arr);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < arr.length; i++) {
            // Ignore duplicates
            if (arr[i] == arr[i - 1]) {
                continue;
            }
            // Consecutive element
            else if (arr[i] == arr[i - 1] + 1) {
                current++;
            }
            // Break in sequence
            else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        return Math.max(longest, current);
    }
}
