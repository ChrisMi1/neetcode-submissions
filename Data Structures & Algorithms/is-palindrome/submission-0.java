class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while (i < j) {
            if (!isAlphanumeric(s.charAt(i))) {
                i++;
                continue;
            }
            
            if (!isAlphanumeric(s.charAt(j))) {
                j--;
                continue;
            }
            
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isAlphanumeric(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }
}
