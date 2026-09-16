class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (int count : mp.values()) {
            if (count > 1) {
                return true;
            }
        }
        return false;
    }
}
