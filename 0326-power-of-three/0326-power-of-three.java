class Solution {
    public boolean isPowerOfThree(int n) {
        double z=0;
        for(int i=0;i<30;i++)
        {
            z=Math.pow(3,i);
            if(z==n)
            {
                return true;
            }
        }
        return false;
    }
}