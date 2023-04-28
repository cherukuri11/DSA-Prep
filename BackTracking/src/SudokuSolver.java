//public class SudokuSolver {
//
//    public static void main(String[] args) {
//
//    }
//  static boolean solve(int[][] board){
//
//  }
//    static boolean isSafe(int[][] board,int row,int col,int num){
//        //check the row
//        for(int i=0;i< board.length;i++){
//            if(board[row][i]==num){
//                return false;
//            }
//        }
//      // check for column
//        for(int i=0;i< board.length;i++){
//            if(board[i][col]==num){
//                return false;
//            }
//        }
//
//        int sqrt=(int)(Math.sqrt(board.length));
//        int rowStart=row-row%sqrt;
//        int colStart=col-col%sqrt;
//
//        for(int r=rowStart;r<rowStart+sqrt;r++){
//            for(int c=colStart;c<colStart;c++){
//                if(board[r][c]==num){
//                    return false;
//                }
//            }
//        }
//   return true;
//
//    }
//}
