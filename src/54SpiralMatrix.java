class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }
        
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
                               
       
        while (left <= right && top <= bottom) {
                for(int c = left; c <= right; c++) {
                    list.add(matrix[top][c]);
                }
                top++;                
                for(int r = top; r <= bottom; r++) {
                    list.add(matrix[r][right]);
                }
                right--;
                for(int c = right; c >= left; c--) {
                    list.add(matrix[bottom][c]);
                }
                bottom--;
                for(int r = bottom; r >= top; r--) {
                    list.add(matrix[r][left]);
                }
                left++;
        }
        
        return list;       
        
    }
}
