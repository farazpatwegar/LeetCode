class Solution {
    public int hammingWeight(int n) {
        int num=0,rem=0;
        while(n!=0){
           rem = n%2;
           num+=rem;
           n=n/2;  
        }
        return num;
    }
}