class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<Integer>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(int i=0; i<strs.length; i++) {
            String s = strs[i];

            int[] freq = new int[26];
            for(char ch : s.toCharArray()) {
                freq[ch-'a']++;
            }
            String key = Arrays.toString(freq);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(i);
        }

        for(Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            List<String> temp = new ArrayList<>();
            List<Integer> sameSet = entry.getValue();
            
            for(Integer i : sameSet) {
                temp.add(strs[i]);
            }

            result.add(new ArrayList<>(temp));
        }
        return result;
    }
}
