class Solution {

    static int search(int arr[], int x) {
        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Element found at index i
            }
        }
        return -1; // Element not found
    }
}
