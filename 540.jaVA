class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr[0];
        else if (arr[0] != arr[1])
            return arr[0];
        else if (arr[n - 1] != arr[n - 2])
            return arr[n - 1];
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1])
                return arr[mid];
            int fo = mid;
            int so = mid;
            if (arr[mid] == arr[mid - 1])
                fo = mid - 1;
            else
                so = mid + 1;
            int lcount = fo - low;
            int rcount = high - so;
            if (lcount % 2 == 0)
                low = so + 1;
            else if (lcount % 2 != 0)
                high = fo - 1;

        }
        return -1;
    }
}
