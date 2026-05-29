class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int currSum = 0;
        int low = 0;
        int result = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            if(nums[i] >= target) {
                return 1;
            }

            currSum += nums[i];

            while(currSum >= target) {
                result = Math.min(result, i-low+1);
                currSum -= nums[low];
                low++;
            }
        }

        return (result==Integer.MAX_VALUE) ? 0 : result;
    }
}