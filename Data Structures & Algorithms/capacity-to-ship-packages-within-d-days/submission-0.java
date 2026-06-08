class Solution {
    private int getMaxWeight(int[] weights) {
        int max = 0;
        for (int weight : weights) {
            max = Math.max(weight, max);
        }
        return max;
    }

    private int getTotal(int[] weights) {
        int total = 0;
        for (int weight : weights) {
            total += weight;
        }
        return total;
    }

    private int getDays(int[] weights, int k) {
        int days = 1;
        int curr = 0;

        for (int weight : weights) {
            if (curr + weight > k) {
                days++;
                curr = 0;
            }
            curr += weight;
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = getMaxWeight(weights); 
        int high = getTotal(weights); 
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int currDays = getDays(weights, mid);

            if (currDays <= days) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}
