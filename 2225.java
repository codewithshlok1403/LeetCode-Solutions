class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            int loss = matches[i][1];
            mp.put(loss, mp.getOrDefault(loss, 0) + 1);
        }
        for (int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            if (!mp.containsKey(win)) {
                mp.put(win, 0);
            }
        }
        ArrayList<Integer> win = new ArrayList<>();
        ArrayList<Integer> loss = new ArrayList<>();
        for (int player : mp.keySet()) {
            if (mp.get(player) == 0) {
                win.add(player);
            }
            if (mp.get(player) == 1) {
                loss.add(player);
            }
        }
        Collections.sort(win);
        Collections.sort(loss);
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(win);
        ans.add(loss);
        return ans;

    }
}
