import java.util.HashSet;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        HashSet<Character> jewelSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelSet.add(jewels.charAt(i));
        }
        for (int j = 0; j < stones.length(); j++) {
            if (jewelSet.contains(stones.charAt(j))) {
                count++;
            }
        }
        
        return count;
    }
}
