class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n: nums) {
            set.add(n);
        }

        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            int stAns = 0;
            while (set.contains(start)) {
                stAns++;
                start++;
            }
            if (stAns > ans) {
                ans = stAns;
            }
        }

        return ans;
        
    }
}
