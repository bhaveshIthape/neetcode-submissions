class Solution {
    public int trap(int[] height) {

        int area = 0;
        int n = height.length;

        for (int i = 1; i < n-1; i++) {
            int rm = maxIndex(height, i+1, n-1);
            int lm = maxIndex(height, 0, i-1);
            int hold = Math.min(rm, lm);
            hold = hold-height[i];
            if (hold > 0) {
                area = area + hold;
            }
        }

        return area;
    }

    public int maxIndex(int[] height, int a, int b) {
        int max = 0;
        for (int i = a; i <= b; i++) {
            if (height[i] > max) {
                max = height[i];
            }
        }
        return max;
    }
}
