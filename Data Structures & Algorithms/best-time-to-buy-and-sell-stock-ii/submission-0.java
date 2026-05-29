class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length;
        int profit = 0;
        int hold = nums[0];

        for(int i=1; i<n; i++) {
            if(nums[i-1] < nums[i]) {
                hold = nums[i];
                profit += nums[i]-nums[i-1];
            }

            if(hold > nums[i]) {
                hold = nums[i];
            }
        }
        return profit;
    }
}