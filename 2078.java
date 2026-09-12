class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int ans = 0;
        for (int j = 1; j < n; j++) {
            if (colors[0] != colors[j]) {
                ans = Math.max(ans, j);
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (colors[i] != colors[n - 1]) {
                ans = Math.max(ans, n - 1 - i);
            }
        }
        return ans;

    }
}
