class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int sum = m + n; 
        int[] arr = new int[sum]; 
        int l = 0; 

        for (int i = 0; i < m; i++) {
            arr[l++] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            arr[l++] = nums2[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < sum; i++) {
            nums1[i] = arr[i];
        }
    }
}
