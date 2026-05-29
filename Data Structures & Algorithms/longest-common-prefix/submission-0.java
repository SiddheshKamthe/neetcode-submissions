class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        boolean flag = true;
        
        for(int j=strs[0].length(); j>=0; j--) {

            result = strs[0].substring(0,j);
            for(int i=1; i<strs.length; i++) {
                if(strs[i].startsWith(result)) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                return result;
            }
        }
        return "";
    }
}