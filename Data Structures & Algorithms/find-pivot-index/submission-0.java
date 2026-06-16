class Solution {
    public int pivotIndex(int[] nums) {

        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            int left = currSum - nums[i];
            int right = totalSum - currSum;
            if (left == right) {
                return i;
            }
        }
        
        return -1;
    }
}