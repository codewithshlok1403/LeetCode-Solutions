class Solution {
    public void generate(String ans, int left, int right, int n, List<String> list) {
        if (right == n) {
            list.add(ans);
            return;
        }

        if (left < n)
            generate(ans + "(", left + 1, right, n, list);
        if (right < left)
            generate(ans + ")", left, right + 1, n, list);

    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate("", 0, 0, n, list);
        return list;
    }
}
