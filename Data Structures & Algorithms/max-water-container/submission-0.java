class Solution {
    public int maxArea(int[] heights) {
        int lo = 0;
        int hi = heights.length - 1;
        int max = 0;
        while (lo < hi) {

            int sum = (hi - lo) * Math.min(heights[hi],heights[lo]);
            if (max < sum) {
                max = sum;
            }

            if (heights[hi] > heights[lo]) {
                lo++;
            } else {
                hi--;
            }
            
        }
        return max;
    }
}
