class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] nums3 = new int[Math.min(n, m)];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (k == 0 || nums3[k - 1] != nums1[i]) {
                    nums3[k] = nums1[i];
                    k++;
                }

                i++;
                j++;
            }
        }

        return Arrays.copyOf(nums3, k);
    }
}
