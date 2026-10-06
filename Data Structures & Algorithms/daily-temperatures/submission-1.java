class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> temps = new Stack<>();
        int [] res = new int[temperatures.length];
        int j = 0;
        for (int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            while (!temps.isEmpty() &&  temp > temps.peek()[0]) {
                int[] pair = temps.pop();
                res[pair[1]] = i - pair[1];
                j--;
            }
            
            temps.push(new int[] {temp,i});
        }

        return res;
    }
}
