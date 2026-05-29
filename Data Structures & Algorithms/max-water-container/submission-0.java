class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxCapacity = 0;

        int low = 0;
        int high = n-1;

        while(low < high) {
            int capacity = Math.min(heights[low], heights[high]) * (high-low);

            maxCapacity = Math.max(maxCapacity, capacity);

            if(heights[low] == heights[high]) {
                low++;
                high--;
            }
            else if(heights[low] < heights[high]) {
                low++;
            }
            else {
                high--;
            }
        }
        return maxCapacity;
    
    }
}
