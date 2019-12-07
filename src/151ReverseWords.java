public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        int i = words.length - 1;
        StringBuilder sb = new StringBuilder();

        while(i >= 0) {
            sb.append(words[i]);
            sb.append(" ");
            i--;
        }
        return sb.toString().trim();
            
    }
}
