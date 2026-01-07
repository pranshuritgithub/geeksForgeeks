class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int num : arr)
        {
            if(num < min)
            {
                secondmin = min;
                min = num;
            }
            else if(num > min && num < secondmin)
            {
                secondmin = num;
            }
        }
        if(secondmin == Integer.MAX_VALUE)
        {
            list.add(-1);
        }
        else{
            list.add(min);
            list.add(secondmin);
        }
        return list;
    }
}
 