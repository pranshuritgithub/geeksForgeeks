// User function Template for Java
class Solution {
    public static int findElementAtIndex(int key, int[] arr) {
        // code here
        int n = arr.length;
        
        for(int i=0;i<n;i++)
        {
            if(i == key)
            {
                return arr[i];
            }
        }
        return 0;
    }
}