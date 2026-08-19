class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = arr[0];
        int max = arr[n - 1];
        int k = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (arr[k] != i) {
                result.add(i);
            } else {
                k++;
            }

        }
        return result;
    }
}
