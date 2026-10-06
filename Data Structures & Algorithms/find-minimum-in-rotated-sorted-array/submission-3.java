class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int lo = 0;
        int hi = n;

        if (nums[lo] <= nums[hi]) return nums[lo];

        int min = nums[lo];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] < min) {
                min = nums[mid];
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return min;
    }
}
