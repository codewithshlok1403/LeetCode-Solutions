class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n + 1];
        alt[0] = 0;
        int highest_altitude = 0;
        for (int i = 1; i < n + 1; i++) {
            alt[i] = gain[i - 1] + alt[i - 1];
            if (highest_altitude < alt[i]) {
                highest_altitude = alt[i];
            }
        }
        return highest_altitude;
    }
}
