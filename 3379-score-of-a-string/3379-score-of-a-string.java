class Solution {
    public int scoreOfString(String s) {
        char[] st=s.toCharArray();
        int sum = 0;
        for(int i=0;i<st.length-1;i++){
            int j=i+1;
            sum=sum+Math.abs(st[i]-st[j]);
        }
        return sum;
    }
}