class Solution {
    public int trap(int[] height) {

        int area = 0;
        int n = height.length;
        int rm = maxIndex(height, 2, n-1);
        int lm = 0;
        for (int i = 1; i < n-1; i++) {
            if (rm <= i) {
                rm = maxIndex(height, i+1, n-1);
            }
            int hold = Math.min(height[rm], height[lm]);
            hold = hold-height[i];
            if (hold > 0) {
                area = area + hold;
            }
            if (height[i] > height[lm]) {
                lm = i;
            }
        }

        return area;
    }

    public int maxIndex(int[] height, int a, int b) {
        int max = -1;
        int maxInd = -1;
        for (int i = a; i <= b; i++) {
            if (height[i] > max) {
                max = height[i];
                maxInd = i;
            }
        }
        return maxInd;
    }
}
