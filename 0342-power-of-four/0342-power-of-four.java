class Solution {
    public boolean isPowerOfFour(int n) {
        double z=0;
        for(int i=0;i<20;i++)
        {
            z=Math.pow(4,i);
            if(z==n)
                return true;
        }
        return false;
    }
}