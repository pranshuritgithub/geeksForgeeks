// User function Template for Java

class Solution {
    public int[] dupLastIndex(int[] arr) {
        int n = arr.length;
        
        for(int i=n-1;i>0;i--)
        {
            if(arr[i] == arr[i-1])
            {
                return new int[]{i, arr[i]};
            }
        }
        return new int[] {-1,-1};
    }
}
