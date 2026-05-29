class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        int low = 0;
        int n = s.length();

        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);

            if(map.containsKey(ch)) {
                low = Math.max(low, map.get(ch) + 1);
            }
            else {
                map.put(ch, i);
            }

            result = Math.max(result, i-low+1);
            map.put(ch, i);
        }
        return result;
    }
}
