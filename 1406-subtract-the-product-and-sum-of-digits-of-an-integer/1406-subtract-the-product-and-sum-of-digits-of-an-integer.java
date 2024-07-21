class Solution {
    public int subtractProductAndSum(int n) {
        int remainder=0,multiplication=1,addition=0;
            while(n>0)
            {
                remainder=n%10;
                multiplication*=remainder;
                addition+=remainder;
                n=n/10;
            }
        return multiplication-addition;
    }
}