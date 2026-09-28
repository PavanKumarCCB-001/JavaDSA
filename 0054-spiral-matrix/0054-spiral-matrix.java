class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;
        List<Integer> res = new ArrayList<>();

        while (top <= bottom && left <= right) {    // When u have Rows or cols to be traversed
            
            for (int i = left; i <= right; i++) {   // Moves to Right
                res.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<= bottom; i++) {     // Moves to Bottom
                res.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {                     // Moves to Left
                for(int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {                     // Moves to Top
                for(int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}