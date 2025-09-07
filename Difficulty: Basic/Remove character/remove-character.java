// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<str1.length();i++)
        {
            boolean found = false;
            
            for(int j=0;j<str2.length();j++)
            {
                if(str2.charAt(j) == str1.charAt(i))
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                result.append(str1.charAt(i));
            }
        }
        return result.toString();
    }
}