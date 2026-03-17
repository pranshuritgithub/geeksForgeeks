// User function Template for Java

class Solution {
    static int isFactorial(int N) {
        // code here
        int i = 1;
        
        while(N > 1)
        {
            if(N % i != 0)
            {
                return 0;
            }
            N = N / i;
            i++;
        }
        return 1;
    }
}