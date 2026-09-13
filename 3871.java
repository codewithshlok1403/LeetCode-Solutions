class Solution {
    public long countCommas(long n) {
        long ans = 0;
      for (long x = 1000; x <= n; ) {
            ans += (n - x + 1);
            if (x > Long.MAX_VALUE / 1000) {
                break;
            }
            x*=1000;
        }
        return ans;

    }
}
