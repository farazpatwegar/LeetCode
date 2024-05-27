class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int j = 0; // Pointer for unique elements
        
        // Iterate through the array
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[j]) {
                // Move the unique element pointer forward
                j++;
                // Place the unique element at its correct position
                nums[j] = nums[i];
            }
        }
        
        // The number of unique elements is the index of the last unique element + 1
        return j + 1;
    }
}
