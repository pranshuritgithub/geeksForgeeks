class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int result = 1;
        
        for(int i=1;i<=n;i++)
        {
            result *= i;
        }
        return result;
    }
}
