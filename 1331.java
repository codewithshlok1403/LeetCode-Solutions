class Solution {
    public int[] arrayRankTransform(int[] arr) {
        //creating a clone of original array
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        Map<Integer, Integer> mp = new HashMap<>();
        int rank = 1;
        for (int num : sortArr) {
            if (!mp.containsKey(num)) {
                mp.put(num, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mp.get(arr[i]);
        }
        return arr;
    }
}
