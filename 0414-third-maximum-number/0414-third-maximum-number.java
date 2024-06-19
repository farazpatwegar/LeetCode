class Solution {
    public int thirdMax(int[] nums) {
     Set<Integer>set=new TreeSet<>();
        for(int x:nums)
        {
            set.add(x);
        }
        int[] arr=new int[set.size()];
    
        int i=0,z=0,start=0,end=arr.length-1;
        for(int y:set)
        {
            arr[i]=y;
            i++;
        }
       
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        if(arr.length>=3)
            z= arr[2];
        if(arr.length==1)
            z=arr[0];
        if(arr.length==2)
            z=arr[0];
        return z;
      
    }
}