class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for (String ch : tokens) {

            if (ch.equals("+")) {
                int last = nums.pop();
                int first = nums.pop();
                nums.push(first + last);
            } else if (ch.equals("-"))  {
                int last = nums.pop();
                int first = nums.pop();
                nums.push(first - last);
            } else if (ch.equals("*"))  {
                int last = nums.pop();
                int first = nums.pop();
                nums.push(first * last);
            } else if (ch.equals("/"))  {
                int last = nums.pop();
                int first = nums.pop();
                nums.push(first / last);
            } else {
                nums.push(Integer.parseInt(ch));
            }

        }

        return nums.peek();
    }
}
