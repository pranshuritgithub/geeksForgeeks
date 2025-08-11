/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        
        int n = arr.length;
        
        for(int i=0;i<n;i++)
        {
            int nums = arr[i];
            int temp = nums;
            int rev = 0;
            
            while(temp > 0)
            {
                int digit = temp % 10;
                rev = rev*10 + digit;
                temp = temp/10;
            }
            
            if(rev != nums)
            {
                return false;
            }
        }
        return true;
    }
}