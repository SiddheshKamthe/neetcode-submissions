class Solution {
    private int getMaxPiles(int[] piles) {
        int max = 0;
        for(int pile : piles) {
            max = Math.max(pile, max);
        }
        return max;
    }

    private int getHours(int[] piles, int k) {
        int hours = 0;

        for(int pile : piles) {
            hours += pile/k;

            if(pile%k != 0) {
                hours += 1;
            }
        }
        return hours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        if(n == h) {
            return getMaxPiles(piles);
        }

        int low = 1;
        int high = getMaxPiles(piles);
        int result = high;

        while(low <= high) {
            int mid = low + (high-low)/2;

            int hours = getHours(piles, mid);

            if(hours > h) {
                low = mid + 1;
            }
            else {
                result = mid;
                high = mid - 1;
            }
        }

        return result;
    }
}
