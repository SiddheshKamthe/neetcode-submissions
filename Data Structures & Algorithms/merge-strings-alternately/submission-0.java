class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int ind1 = 0;
        int ind2 = 0;
        
        while(ind1 < word1.length() && ind2 < word2.length()) {
            sb.append(word1.charAt(ind1));
            sb.append(word2.charAt(ind2));

            ind1++; ind2++;
        }

        while(ind1 < word1.length()) {
            sb.append(word1.charAt(ind1));
            ind1++;
        }

        while(ind2 < word2.length()) {
            sb.append(word2.charAt(ind2));
            ind2++;
        }

        return sb.toString();
    }
}