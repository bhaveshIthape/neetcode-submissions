class Solution {
    public int firstMissingPositive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int si = 1;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = si; i <= nums.length+1; i++) {
            if (set.contains(si)) {
                si++;
            }
        }

        return si;
        
    }
}