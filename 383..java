class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mag_mp = new HashMap<>();
        for (char ch : magazine.toCharArray()) {
            mag_mp.put(ch, mag_mp.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (mag_mp.containsKey(ch) && mag_mp.get(ch) > 0) {
                mag_mp.put(ch, mag_mp.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
