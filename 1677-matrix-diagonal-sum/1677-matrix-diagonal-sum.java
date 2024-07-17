class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,n=mat.length,mid=n/2;
        for(int i=0;i<n;i++)
        {
            sum+=mat[i][i];
            sum+=mat[i][n-i-1];
            
        }
        if(n%2==1)
                sum-=mat[mid][mid];
        return sum;
    }
}