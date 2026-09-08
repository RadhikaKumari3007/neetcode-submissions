class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                // Minimum is in the right half (rotation point is after mid)
                left = mid + 1;
            } else {
                // Minimum is in the left half, including mid itself
                right = mid;
            }
        }
        
        return nums[left];
    }
}