class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String elem : strs) {
            int len = elem.length();
            sb.append(len).append("#").append(elem);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        int start = 0;
        List<String> decodedStrings = new ArrayList<>();
        while (start < str.length()) {
            int currIndex = str.indexOf("#",start);
            int len = Integer.parseInt(str.substring(start, currIndex));

            start = currIndex + len + 1;

            String decodedString = str.substring(currIndex + 1,start);

            decodedStrings.add(decodedString);
        }
        return decodedStrings;
    }
}
