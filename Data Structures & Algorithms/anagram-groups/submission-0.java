class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> count = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            int [] chars = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                chars[strs[i].charAt(j) - 'a']++;
            }
            String key = Arrays.toString(chars);
            List<String> group = count.computeIfAbsent(key, k -> new ArrayList<>());

            group.add(strs[i]);

        }

        res.addAll(count.values());

        return res;
    }
}
