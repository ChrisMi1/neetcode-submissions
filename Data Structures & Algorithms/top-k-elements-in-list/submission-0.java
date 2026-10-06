class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for (var num : nums) {
            // calculate the frequency of every element
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
                freq[i] = new ArrayList<>();
        }
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int j = 0;
        for (int i = freq.length - 1; i > 0; i--) {
            if (!freq[i].isEmpty()) {
                for (var elem : freq[i]) {
                    if (j < k) {
                        res[j] = elem;
                        j++;
                    } else {
                        return res;
                    }
                    
                }
            }
        }
        return res;

    }
}
