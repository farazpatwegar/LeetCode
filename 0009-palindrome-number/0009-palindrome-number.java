class Solution {
    public boolean isPalindrome(int x) {
        // Special cases:
        // If x is negative, it cannot be a palindrome
        // If x is divisible by 10 but not equal to 0, it cannot be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // When the length is an odd number, we can get rid of the middle digit by reversed/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, reversed = 123,
        // since the middle digit doesn't matter in palindrome(it will always equal to itself), we can simply get rid of it.
        return x == reversed || x == reversed / 10;
    }
}
