class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int n = arr.length;
        int counte = 0;
        int counto = 0;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] % 2 == 0)
            {
                counte++;
            }
            else{
                counto++;
            }
        }
        return new int[]{counto,counte};
    }
}