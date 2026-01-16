class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(int n : arr)
        {
            map.put(n,map.getOrDefault(n,0) + 1);
        }

        return map.getOrDefault(target,0);
    }
}
