// User function Template for Java

class Solution {
    int countSubstr(String S) {
        // your code here
        int n = S.length();
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            char ch = S.charAt(i);
            
            if(ch == '1')
            {
                count++;
            }
        }
        return count*(count-1)/2;
    }
}