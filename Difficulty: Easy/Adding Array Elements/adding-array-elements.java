import java.util.*;

class Solution {
    int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Step 1: put all elements in min-heap
        for (int val : arr) {
            pq.offer(val);
        }
        
        int operations = 0;
        
        // Step 2: keep combining until smallest element >= k
        while (!pq.isEmpty() && pq.peek() < k) {
            
            // if less than 2 elements, can't proceed
            if (pq.size() < 2) {
                return -1;
            }
            
            int first = pq.poll();   // smallest
            int second = pq.poll();  // second smallest
            
            int newVal = first + second;
            pq.offer(newVal);
            
            operations++;  // count this operation
        }
        
        return operations;
    }
}
