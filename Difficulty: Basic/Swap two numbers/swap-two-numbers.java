class Solution {
    static List<Integer> get(int a, int b) {
        // code here
       b = a+b - (a=b);
        
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        
        return list;
    }
}