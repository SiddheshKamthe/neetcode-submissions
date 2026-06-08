class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int result = 0;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if((long)mid*mid == (long)x) {
                return mid;
            }

            if((long)mid*mid < (long)x) {
                result = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return result;
    }
}