class Solution {
    public int[] sortArray(int[] nums) {

        int usl = -1;

        while (usl < nums.length-1) {
            int smallest = Integer.MAX_VALUE;
            int si = -1;
            for (int i = usl+1; i < nums.length; i++) {
                if (nums[i] < smallest) {
                    smallest = nums[i];
                    si = i;
                }
            }

            int temp = nums[si];
            nums[si] = nums[usl+1];
            nums[usl+1] = temp;

            usl++;
        }

        return nums;
        
    }
}