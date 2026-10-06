class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> temps = new Stack<>();
        int [] res = new int[temperatures.length];
        int j = 0;
        for (int i = 0; i < temperatures.length; i++) {

            while (j > 0 && temperatures[i] > temps.peek()[0]) {
                res[temps.peek()[1]] = i - temps.pop()[1];
                j--;
            }
            
            temps.push(new int[] {temperatures[i],i});
            j++;
        }

        return res;
    }
}
