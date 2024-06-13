class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer>set=new HashSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        int[] arr=new int[set.size()];
        int k=0;
        for(int j:set)
        {
            arr[k]=j;
            k++;
        }
        Arrays.sort(arr);
        int maxcount=0,count=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]-arr[i]==1)
                count++;
             if(count>maxcount)
                    maxcount=count;
             if(arr[i+1]-arr[i]!=1)
            {
               
                count=0;
            }       
        }
        return maxcount+1;
    }
}