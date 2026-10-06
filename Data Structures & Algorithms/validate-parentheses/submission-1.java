class Solution {
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (chars.isEmpty()) return false;
                char par = chars.pop();
                if (par != '(') return false;
                else continue;
            } else if (s.charAt(i) == '}') {
                if (chars.isEmpty()) return false;
                char par = chars.pop();
                if (par != '{') return false;
                else continue;
            } else if (s.charAt(i) == ']') {
                if (chars.isEmpty()) return false;

                char par = chars.pop();
                if (par != '[') return false;
                else continue;
            } else {
                chars.push(s.charAt(i));
            }
        }

        if (chars.isEmpty()) return true;
        else return false;
    }
}
