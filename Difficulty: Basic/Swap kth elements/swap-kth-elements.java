
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
       int n = arr.size();
       
       int firstIndex = k-1;
       int endIndex = n-k;
       
       int temp = arr.get(firstIndex);
       arr.set(firstIndex,arr.get(endIndex));
       arr.set(endIndex,temp);
    }
}
