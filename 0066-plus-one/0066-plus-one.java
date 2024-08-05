public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Set current digit to 0 and continue with carry
            digits[i] = 0;
        }
        
        // If all digits are 9, we need to allocate a new array with an extra digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Set the most significant digit to 1
        return newDigits;
    }

}
