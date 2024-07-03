class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i:arr)
        {
            if(k>=i)
                k++;
            else
                break;
        
        }
        return k;
    }
}