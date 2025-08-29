// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        int m = arr.length;
        boolean [] present = new boolean[B-A+1];  //number in range[A,B]
        
        for(int i=0;i<m;i++)
        {
            if(arr[i] >= A && arr[i] <= B)
            {
                present[arr[i]-A] = true;
            }
        }
        
        for(boolean p : present)
        {
            if(!p)
            {
                return false;
            }
        }
        return true;
        
    }
}
