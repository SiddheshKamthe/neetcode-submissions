class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int result = 0;
        int currSum = 0;
        map.put(0,1);

        for(int i=0; i<n; i++) {
            currSum += nums[i];
            if(map.containsKey(currSum-k)) {
                result += map.get(currSum-k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return result;
    }
}