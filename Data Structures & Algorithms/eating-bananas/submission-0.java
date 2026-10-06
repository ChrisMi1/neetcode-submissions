class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            if (max < piles[i]) max = piles[i];
        }

        int lo = 1;
        int hi = max;
        int rate = max;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int time = 0, shortestTime = h;
            

            for (int i = 0; i < piles.length; i++) {
                time += (mid + piles[i] - 1) / (mid);
            }
            if (shortestTime >= time) {
                rate = mid;
            }
            if (time <= h ) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return rate;
    }
}
