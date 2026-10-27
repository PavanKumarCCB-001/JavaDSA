class Solution {
    public String[] createGrid(int m, int n) {

        String[] res = new String[m];

        for (int i = 0; i < m; i++) {

            StringBuilder sb = new StringBuilder(); // For every Row

            for (int j = 0; j < n; j++)
                sb.append(i == 0 || j == n - 1 ? '.' : '#');

            res[i] = sb.toString();
        }
        return res;
    }
}