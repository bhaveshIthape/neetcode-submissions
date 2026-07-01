class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = i+1;

        while (j < nums.length) {
            while(j < nums.length && nums[j] <= nums[i]) {
                j++;
            }
            if (j < nums.length) {
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }

        return i+1;
        
    }
}