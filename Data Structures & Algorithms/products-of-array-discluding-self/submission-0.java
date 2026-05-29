class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long product = 1;
        int zeroCount = 0;
        int[] result = new int[n];

        //get total product
        for(int i=0; i<n; i++) {
            if(nums[i] == 0) {
                zeroCount++;
                if(zeroCount == 1) {
                    result[i] = -1;
                }
            }
            else {
                product *= nums[i];
            }
        }

        if(zeroCount > 1) {
            // for(int i=0; i<n; i++) {
            //     result[i] = 0;
            // }
            return new int[n];
        }

        else if(zeroCount == 1) {
            for(int i=0; i<n; i++) {
                if(result[i] == -1) {
                    result[i] = (int)product;
                }
                else {
                    result[i] = 0;
                }
            }

            return result;
        }

        else {
            for(int i=0; i<n; i++) {
                long prod = product;
                result[i] = (int)prod/nums[i];
            }
            
        }
        return result;
    }
}  
