class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        if(k == 0) {
            return;
        }
        
        //rotate 0 to k-1
        int low = 0;
        int high = n-k-1;
        while(low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++; high--;
        }
    
        
        low = n-k;
        high = n-1;
        while(low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++; high--;
        }

        low = 0;
        high = n-1;
        while(low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++; high--;
        }
    }
}