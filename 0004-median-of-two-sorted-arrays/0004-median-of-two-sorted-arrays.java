class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=new ArrayList<>();
        for(int x:nums1)
            list.add(x);
        for(int y:nums2)
            list.add(y);
        int[] arr=new int[list.size()];
        for(int z=0;z<list.size();z++)
        {
            arr[z]=list.get(z);
            
        }
        double temp=0; 
        Arrays.sort(arr);
         if(arr.length%2==0)
        {
            temp=arr[(arr.length/2)]+arr[(arr.length/2-1)];
            return temp/2.0;
        }
        else
        {
             return (double)arr[(arr.length/2)];   
        }
    }
}