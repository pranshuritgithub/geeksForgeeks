class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int n : arr)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        for(int n : arr)
        {
            if(map.containsKey(n))
            {
                ArrayList<Integer> pair = new ArrayList<>();
                
                pair.add(n);
                pair.add(map.get(n));
                
                ans.add(pair);
                map.remove(n);
            }
        }
        return ans;
    }
}