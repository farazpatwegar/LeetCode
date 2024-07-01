class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        int small=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            small=nums[i];
            count=0;
            for(int j=0;j<nums.length;j++)
            {
               if(small>nums[j]) 
               {
                   count++;
                   arr[i]=count;
               }  
            }
        }
        return arr;
    }
}