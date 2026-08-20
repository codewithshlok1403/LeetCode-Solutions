class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        int c = 0;
        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[c];
            c++;
            if (c == n)
                c = 0;
        }
        return ans;
    }
}
