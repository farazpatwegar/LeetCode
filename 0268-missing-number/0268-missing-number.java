class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (len*(len+1))/2;
        int add = 0;
        for(int num:nums){
            add+=num;
        }
        return sum-add;
    }
}