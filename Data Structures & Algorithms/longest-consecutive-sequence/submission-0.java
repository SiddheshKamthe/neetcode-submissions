class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        for(int num : nums) {
            if(!set.contains(num-1)) {
                int len = 1;
                while(set.contains(num+len)) {
                    len++;
                }
                result = Math.max(result, len);
            }
        }
        return result;
    }
}
