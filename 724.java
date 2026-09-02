class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 0;
        rightSum[n - 1] = 0;
        for (int i = 1; i < n; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightSum[i] = nums[i + 1] + rightSum[i + 1];
        }
        for (int k = 0; k < n; k++) {
            if (leftSum[k] == rightSum[k]) {
                return k;
            }
        }
        return -1;
    }
}
