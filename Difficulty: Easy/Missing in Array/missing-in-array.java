class Solution {
    int missingNum(int arr[]) {
        
        int n = arr.length;
        long total =(long) (n+1)*(n+2)/2;
        
        for(int i=0;i<n;i++)
        {
            total -= arr[i];
        }
        return (int) total;
    }
}