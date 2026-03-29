package recursion.Sequences;

import java.util.ArrayList;
import java.util.List;

public class TotalNQueens {
    public static void main(String[] args) {

        System.out.println(solveNQueens(4));
    }
    static int solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return solve(0, board, ans, n);
    }
    static int solve(int col,char[][] board,List<List<String>> ans,int n){
        if (col == n) {
            ans.add(construct(board));
            return 1;
        }
        int count=0;
        for (int row = 0; row < n; row++) {
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                count+=solve(col+1,board,ans,n);
                board[row][col]='.';
            }
        }
        return count;
    }
    static boolean isSafe(int row,int col,char[][] board,int n){
        int dupRow=row;
        int dupCol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q') return false;
            row--;
            col--;
        }
        col=dupCol;
        row=dupRow;
        while (col>=0){
            if(board[row][col]=='Q') return  false;
            col--;
        }

        row=dupRow;
        col=dupCol;
        while(row<n && col>=0){
            if(board[row][col]=='Q') return false;
            row++;
            col--;
        }
        return  true;
    }

    static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }
}
