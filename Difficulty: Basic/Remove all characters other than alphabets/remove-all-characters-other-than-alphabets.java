class Solution {
    String removeSpecialCharacter(String S) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || 
                (ch >= 'A' && ch <= 'Z')) {
                result.append(ch);
            }
        }

        return result.length() == 0 ? "-1" : result.toString();
    }
}
