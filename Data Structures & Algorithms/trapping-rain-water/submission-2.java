class Solution {
    public int trap(int[] height) {

        int l = 0;
        int r = height.length-1;
        int lm = height[l];
        int rm = height[r];
        int res = 0;

        while (l < r) {
            if(lm < rm) {
                l++;
                lm = Math.max(lm, height[l]);
                res = res + (lm-height[l]);                
            } else {
                r--;
                rm = Math.max(rm, height[r]);
                res = res + (rm-height[r]);
            }
        }

        return res; 
        
    }
}

