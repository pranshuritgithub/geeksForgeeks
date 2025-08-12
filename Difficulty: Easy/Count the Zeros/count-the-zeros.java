// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        
        int n = arr.length;
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 0)
            {
                count++;
            }
        }
        return count;
    }
}
