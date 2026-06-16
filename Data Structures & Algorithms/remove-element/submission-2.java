class Solution {
    public int removeElement(int[] nums, int val) {

        int i = 0;
        int j = nums.length;

       

        while (i < j) {
            if (nums[i] == val) {
                j--;
                nums[i] = nums[j];
            }
            else {
                i++;
            }
        }

        return j;
        
    }
}