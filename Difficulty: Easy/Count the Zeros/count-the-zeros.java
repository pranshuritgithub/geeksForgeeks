// User function Template for Java

class Solution {
    int countZeroes(int[] arr) {
        // code here
        int n = arr.length;
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}
