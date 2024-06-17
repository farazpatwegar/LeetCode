class Solution {
    public int findNumbers(int[] nums) {
        	//Scanner sc=new Scanner(System.in);
	int count=0,r,i,size,output=0,n;
	//int[] arr;
	//System.out.println("enter size of array");
	//size=sc.nextInt();
	//arr=new int[size];
	//for(i=0;i<arr.length;i++)
	//{
		//arr[i]=sc.nextInt();
	//}
	for(i=0;i<nums.length;i++)
	{
		n=nums[i];
		count=0;
		while(n!=0)
		{
			count++;
			r=n%10;
			n=n/10;
		}
		if(count%2==0)
			output++;
		
	}
	return output;
	}
    
}