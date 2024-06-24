class Solution {
    public int reverse(int x) {
        long b = 0;       
        while (x != 0) {
            b = b * 10 + x%10;
            x = x / 10;
            if(b>Integer.MAX_VALUE || b<Integer.MIN_VALUE)
            return 0;
        }
        return (int) b;
    }
}