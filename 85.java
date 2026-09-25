class Solution {
    public static int getMaxArea(int[] row) {
        int n = row.length;
        int[] nse = new int[n];
        nse[n-1]=n;
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && row[st.peek()] >= row[i])
                st.pop();
            if (st.size() == 0)
                nse[i] = n;
            else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
        while (st.size() > 0)
            st.pop();
        int[] pse = new int[n];
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && row[st.peek()] >= row[i])
                st.pop();
            if (st.size() == 0)
                pse[i] = -1;
            else {
                pse[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = row[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int[] histogram = new int[matrix[0].length];
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    histogram[j] += 1;
                } else {
                    histogram[j] = 0;
                }
            }
            int area = getMaxArea(histogram);
            max = Math.max(max, area);

        }

        return max;
    }
}
