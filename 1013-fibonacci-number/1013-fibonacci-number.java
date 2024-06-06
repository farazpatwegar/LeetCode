class Solution {
    public int fib(int n) {
        int[] arr=new int[n+1];
        int a=-1,b=1,sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            arr[i]=sum;
        }
        return arr[n];
    }
}