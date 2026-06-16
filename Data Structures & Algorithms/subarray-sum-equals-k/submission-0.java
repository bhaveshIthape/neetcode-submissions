class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int res = 0;
        int prefixsum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];
            int toFind = prefixsum - k;
            if (map.containsKey(toFind)) {
                res += map.get(toFind);
            }
            if (map.containsKey(prefixsum)) {
                map.put(prefixsum, 1+map.get(prefixsum));
            } else {
                map.put(prefixsum, 1);
            }
            
        }

        return res;
        
    }
}