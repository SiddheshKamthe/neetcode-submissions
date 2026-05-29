class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int result = 0;
        int high = n-1;
        int low = 0;

        Arrays.sort(people);

        for(high=n-1; high>=0; high--) {
            if(people[high] == limit) {
                result++;
            }
            else {
                break;
            }
        }

        while(low <= high) {
            int weight = people[low] + people[high];
            if(weight == limit) {
                result++;
                low++;
                high--;
            }
            else if(weight > limit) {
                result++;
                high--;
            }
            else {
                result++;
                low++;
                high--;
            }
        }
        return result;
    }
}