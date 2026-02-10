// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        return reverse(n,0);
    }
    private int reverse(int n, int rev)
    {
        if(n == 0) return rev;
            
            int digit = n % 10;
            rev = (rev*10)+digit;
            
            return reverse(n/10,rev);
    }
}