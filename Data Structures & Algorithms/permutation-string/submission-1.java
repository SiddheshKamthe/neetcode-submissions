class Solution {
    private boolean checkValid(int[] freq1, int[] freq2) {
        for(int i=0; i<26; i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        if(n < m) {
            return false;
        }
        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<m; i++) {
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }

        boolean result = checkValid(freq1, freq2);
        if(result) {
            return result;
        }

        for(int i=m; i<n; i++) {
            freq2[s2.charAt(i-m) - 'a']--;
            freq2[s2.charAt(i) - 'a']++;

            if(freq2[s2.charAt(i-m)-'a'] == freq1[s2.charAt(i-m) - 'a'] 
                && freq2[s2.charAt(i) - 'a'] == freq1[s2.charAt(i) - 'a']) {
                    if(checkValid(freq1, freq2)) {
                        return true;
                    }
            }
        }

        return false;
    }
}
