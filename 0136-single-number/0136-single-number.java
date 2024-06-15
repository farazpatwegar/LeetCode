class Solution {
    public int singleNumber(int[] nums) {
      Map<Integer,Integer>map=new HashMap<>();
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
              x=entry.getKey();  
        }
        return x;
    }
}