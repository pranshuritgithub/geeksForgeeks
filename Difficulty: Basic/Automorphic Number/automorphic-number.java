class Solution {
    public String is_AutomorphicNumber(int n) {
        if ((n * n) % 10 == n % 10) {
            return "Automorphic";
        } else {
            return "Not Automorphic";
        }
    }
}
