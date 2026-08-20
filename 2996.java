class Solution {
    public int missingInteger(int[] arr) {
        int n = arr.length;
        int sum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                sum += arr[i];
            } else
                break;
        }
        while (true) {
            boolean is_found = false;
            for (int i = 0; i < n; i++) {
                if (arr[i] == sum) {
                    is_found = true;
                }
            }
            if (is_found == false) {
                return sum;
            }
            sum++;
        }

    }
}
