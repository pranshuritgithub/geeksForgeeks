class Solution {
    boolean isBinary(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }
}