class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for (var elem : nums) {
            if (!numsSet.add(elem)) return true;
        }

        return false;
    }
}