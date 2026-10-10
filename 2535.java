class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num != 0) {
                digitSum += num % 10;
                num = num / 10;
            }
        }
        int ans = digitSum - elementSum;
        if (ans < 0) {
            ans *= -1;
        }
        return ans;

    }
}
