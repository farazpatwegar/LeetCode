/*class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            list.add(nums[i]);
        }
       Iterator<Integer>iterator=list.iterator();
        {
            while(iterator.hasNext())
            {
                if(iterator.next()==val)
                    iterator.remove();
            }
        }
        return list.size();
    }
}*/



class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
}