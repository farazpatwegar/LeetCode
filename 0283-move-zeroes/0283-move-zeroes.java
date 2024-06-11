class Solution {
    public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0) {
            return;
        }
        
      int right=0,left=0,temp=0;
        while(right<nums.length)
        {
            if(nums[right]!=0)
            {
             temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
                
            right++;
        }
        
    }
}