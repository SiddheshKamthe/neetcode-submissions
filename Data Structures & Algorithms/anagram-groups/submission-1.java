class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(int i=0; i<strs.length; i++) {
            String s = strs[i];

            int[] freq = new int[26];
            for(char ch : s.toCharArray()) {
                freq[ch-'a']++;
            }
            String key = Arrays.toString(freq);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
