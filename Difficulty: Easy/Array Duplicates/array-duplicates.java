class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int num : arr)
        {
            if(map.get(num) > 1)
            {
                list.add(num);
                map.put(num,0);  // mark as already added
            }
        }
       
        return list;
    }
}