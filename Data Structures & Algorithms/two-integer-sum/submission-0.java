class Solution {
    public int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        Map<Integer,Integer> mapValues = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            
            if (mapValues.get(nums[i]) != null) {
                res[0] = mapValues.get(nums[i]);
                res[1] = i;
            }

            mapValues.put(target - nums[i], i);
        }

        return res;
    }
}
