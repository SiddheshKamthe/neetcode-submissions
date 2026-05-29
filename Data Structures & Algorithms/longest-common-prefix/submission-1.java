class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String result = strs[0];
        String result2 = strs[strs.length-1];

        while(result.length() > 0) {
            if(strs[0].startsWith(result) && strs[strs.length-1].startsWith(result)) {
                return result;
            }

            result = result.substring(0, result.length()-1);
        }

        return "";

    }
}