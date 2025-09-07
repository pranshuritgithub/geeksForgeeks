class Solution {
    public int findSum(String s) {
        // code here
        int n = s.length();
        int sum = 0;
        String temp = "0";
        
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            
            if(Character.isDigit(ch))
            {
                temp += ch;
            }
            else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        sum += Integer.parseInt(temp);
        return sum;
    }
}