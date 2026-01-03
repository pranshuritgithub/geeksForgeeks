// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        
        int factor = 2;
        int largest = 1;
        
        while(n > 1)
        {
            if(n % factor == 0)
            {
                largest = factor;
                n /= factor;
            }
            else{
                factor++;
            }
        }
        return largest;
        
    }
}