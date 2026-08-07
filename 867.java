class Solution {
    public int[][] transpose(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return new int[0][0];
        }

        int m = arr.length;
        int n = arr[0].length;
        int[][] k = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                k[j][i] = arr[i][j];
            }
        }

        return k;
    }
}
