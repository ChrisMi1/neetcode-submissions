class TimeMap {
    private Map<String,List<Pair>> keyValues;
    
    public TimeMap() {
        keyValues = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        keyValues.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(timestamp,value));
    }

    public String get(String key, int timestamp) {
        List<Pair> pairs = keyValues.get(key);
        if (pairs == null) return "";

        int lo = 0;
        int hi = pairs.size() - 1;
        String latestValue = "";
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (pairs.get(mid).getTimestamp() <= timestamp) {
                latestValue = pairs.get(mid).getValue();
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return latestValue;
    }

    private static class Pair {
        private int timestamp;
        private String value;

        public Pair (int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public String getValue() {
            return value;
        }
    }
}
