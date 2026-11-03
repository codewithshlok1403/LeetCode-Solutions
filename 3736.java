class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int last_ele = nums[n - 1];
        int no_of_move = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != last_ele) {
                no_of_move += last_ele - nums[i];
            }
        }
        return no_of_move;
    }
}
