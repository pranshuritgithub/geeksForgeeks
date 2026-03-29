class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
       int freq[] = new int [26];
       
       for(int i=0;i<s.length();i++)
       {
           freq[s.charAt(i) - 'a']++;
       }
       
       int max = 0;
       char result = 'a';
       
       for(int i=0;i<26;i++)
       {
           if(freq[i] > max)
           {
               max = freq[i];
               result = (char) (i + 'a');
           }
       }
       return result;
    }
}