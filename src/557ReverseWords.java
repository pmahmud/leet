class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" "); // s.trim().split("\\s+" is better
        StringBuilder sb = new StringBuilder();

        for(String word: words) {
            int i = word.length() - 1;
            while(i >= 0) {
                sb.append(word.charAt(i));
                i--;
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
