class Solution {
    public boolean checkString(String s) {
        int idx = 0;
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            idx++;
            if (s.charAt(i) == 'b') {
                break;
            }
        }
        for (int i = idx; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                result = false;
                break;
            }
        }
        return result;
    }
}
