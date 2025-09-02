
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int val : a)
        {
            freq.put(val, freq.getOrDefault(val,0)+1);
        }
        
        for(int val : b)
        {
            if(!freq.containsKey(val) || freq.get(val) == 0)
            {
                return false;
            }
            freq.put(val, freq.get(val)-1);
        }
        return true;
    }
}
