class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int second = -1;
        
        for(int num : arr)
        {
            if(num > largest)
            {
                second = largest;
                largest = num;
            }
            else if(num < largest && num > second)
            {
                second = num;
            }
        }
        return second;
    }
}