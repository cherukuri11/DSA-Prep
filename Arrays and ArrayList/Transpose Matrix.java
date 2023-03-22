class Solution {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int arr[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
}


/*Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
*/