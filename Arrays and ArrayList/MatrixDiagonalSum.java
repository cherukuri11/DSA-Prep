/*Given a square matrix mat, return the sum of the matrix diagonals.

Only include the sum of all the elements on the primary diagonal and all the elements on the
 secondary diagonal that are not part of the primary diagonal.

 Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

*/


class Solution {
    public int diagonalSum(int[][] mat) {
        int length=mat.length;
        int sum=0;
        for(int i=0;i<length;i++){
            int j=mat[i][i];
            int k=mat[i][length-i-1];
            sum+=j+k;
        }
        if(length%2==0)return sum;
        else return sum-mat[length/2][length/2];


    }
}