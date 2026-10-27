class Solution {
    public String[] createGrid(int m, int n) {

        String[] res = new String[m];

        for (int i = 0; i < m; i++) {

            StringBuilder sb = new StringBuilder(); // For every Row
            for (int j = 0; j < n; j++) {
                if (i == 0) // For Top Row
                    sb.append('.');
                else if (j == n - 1) // For the End Column
                    sb.append('.');
                else
                    sb.append('#');
            }
            res[i] = sb.toString();
        }
        return res;
    }
}