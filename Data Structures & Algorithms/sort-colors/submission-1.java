class Solution {
    public void sortColors(int[] nums) {

        int i = 0;
        int m = 0;
        int j = nums.length-1;

        while (j >= m) {
            if (nums[m] == 0) {
                int temp = nums[i];
                nums[i] = nums[m];
                nums[m] = temp;
                i++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                int temp = nums[j];
                nums[j] = nums[m];
                nums[m] = temp;
                j--;
            }
        }
    }
}