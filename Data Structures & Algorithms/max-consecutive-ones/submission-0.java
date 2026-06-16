class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int ans = 0;
        int fa = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ans = ans+1;
            } else {
                ans = 0;
            }

            if (ans > fa) {
                fa = ans;
            }


        }

        return fa;
        
    }
}