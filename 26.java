class Solution {
    public int removeDuplicates(int[] arr) {
        int k = 0;
        int n = arr.length;
        if (n == 0)
            return 0;
        for (int i = 0; i < n; i++) {
            if (k == 0 || arr[i] != arr[k - 1]) {
                arr[k] = arr[i];
                k++;
            }

        }
        return k;
    }
}
