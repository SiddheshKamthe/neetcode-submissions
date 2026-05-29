class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if(k > n)   k = n%k;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<=k && i<n; i++)  {
            if(map.isEmpty())   {
                map.put( nums[i],i );
                continue;
            }

            if(map.containsKey(nums[i]))    {
                return true;
            }

            map.put(nums[i],i);
        }

        for(int i=k+1; i<n; i++)  {
            map.remove(nums[i-k-1]);

            if(map.containsKey(nums[i]))   return true;
            
            map.put(nums[i], i);
        }

        return false;
    }
}