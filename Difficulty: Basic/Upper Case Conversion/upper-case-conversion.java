// User function Template for Java

class Solution {
    public String convert(String s) {
        // code here
        int n = s.length();
        
        char [] chars = s.toCharArray();
        boolean found = true;
        
        for(int i=0;i<n;i++)
        {
            if(chars[i] == ' ')
            {
                found = true;
            }
            else if(found)
            {
                chars[i] = Character.toUpperCase(chars[i]);
                found = false;
            }
        }
        return new String(chars);
        
    }
}