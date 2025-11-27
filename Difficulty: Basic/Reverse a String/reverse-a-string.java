// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = n-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}