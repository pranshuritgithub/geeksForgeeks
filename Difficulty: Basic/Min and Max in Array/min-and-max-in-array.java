class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        
        return list;
    }
}
