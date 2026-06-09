class Solution {
    private int getMax(int[] nums) {
        int max = 0;
        for(int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

    private int getSplit(int[] nums, int mid) {
        int count = 1;
        int curr = 0;

        for(int i=0; i<nums.length; i++) {
            if(curr+nums[i] > mid) {
                count++;
                curr = 0;
            }

            curr += nums[i];
        }
        return count;
    }

    public int splitArray(int[] nums, int k) {
        int low = getMax(nums);
        int high = 0;
        int n = nums.length;

        for(int num : nums) {
            high += num;
        }

        if(k == n) {
            return low;
        }

        while(low <= high) {
            int mid = low + (high-low)/2;

            int getK = getSplit(nums, mid);

            if(getK <= k) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}