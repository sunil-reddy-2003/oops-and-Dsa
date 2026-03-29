package recursion.Sequences;
import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board={
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'} };


        System.out.println(solveSudoku(board));
//        System.out.println(Arrays.deepToString(board));
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }

    }
     static boolean solveSudoku(char[][] board) {
         for (int i = 0; i < board.length; i++) {
             for (int j = 0; j < board[0].length; j++) {
                 if(board[i][j]=='.'){
                     for (char cell = '1'; cell <='9'; cell++) {
                         if(isValid(i,j,board,cell)){
                             board[i][j]=cell;
                            if(solveSudoku(board)){
                                return true;
                            }else{
                                board[i][j]='.';
                            }
                         }
                     }
                     return false;
                 }
             }
         }
         return true;
    }

    static boolean isValid(int row,int col,char[][] board,char cell){
        for(int i=0; i<9; i++){
            if(board[row][i]==cell){
                return false;
            }
            if(board[i][col]==cell){
                return false;
            }
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==cell){
                return false;
            }
        }
        return true;
    }
}
