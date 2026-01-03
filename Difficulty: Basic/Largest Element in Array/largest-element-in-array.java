class Solution {
    public static int largest(int[] arr) {
        
        int n = arr.length;
        int largest = 0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] > largest)
            {
                largest = arr[i];
            }
        }
        return largest;
    }
}
