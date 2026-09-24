class Solution {
    public void setZeroes(int[][] matrix) {

        List<Integer> rowstobezero = new ArrayList<>(); // Storing indexes of ROWS where 0 is there
        List<Integer> colstobezero = new ArrayList<>(); // Storing indexes of COLUMNS where 0 is there

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowstobezero.add(i);
                    colstobezero.add(j);
                }
            }
        }
        
        // Assigning 0's to that Row.
        for (int i = 0; i < rowstobezero.size(); i++) {
            int curr_idx = rowstobezero.get(i);
            for (int k = 0; k < matrix[0].length; k++)
                matrix[curr_idx][k] = 0;
        }

        // Assigning 0's to that Column.
        for(int i=0;i<colstobezero.size();i++) {
            int curr_idx = colstobezero.get(i);
            for (int k = 0; k < matrix.length; k++)
                matrix[k][curr_idx] = 0;
        }
    }
}