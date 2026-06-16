class NumMatrix {

    private int[][] prefix;

    public NumMatrix(int[][] matrix) {

        prefix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                rowSum = rowSum + matrix[i][j];
                int prevRowMatSum = (i == 0) ? 0 : prefix[i-1][j];
                prefix[i][j] = rowSum + prevRowMatSum;
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int up = 0;
        int left = 0;
        int chhota = 0;

        if (row1 == 0) {
            up = 0;
            chhota = 0;
        } else {
            up = prefix[row1-1][col2];
        }

        if (col1 == 0) {
            left = 0;
            chhota = 0;
        } else {
            left = prefix[row2][col1-1];
        }

        if (row1 != 0 && col1 != 0) {
            chhota = prefix[row1-1][col1-1];
        }

        int ans = prefix[row2][col2] + chhota - left - up;

        return ans;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */