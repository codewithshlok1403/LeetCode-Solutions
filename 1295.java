class Solution {
    public int count(int num) {
        int count = 0;
        while (num != 0) {
            count += 1;
            num = num / 10;
        }
        return count;
    }

    public int findNumbers(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = count(nums[i]);
            if (temp % 2 == 0)
                c++;
        }
        return c;
    }
}
