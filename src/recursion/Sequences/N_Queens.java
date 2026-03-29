package recursion.Sequences;


import java.util.ArrayList;
import java.util.List;

public class N_Queens {
    public static void main(String[] args) {
        List<List<String>> ans=solveNQueens(4);
        System.out.println(ans);
    }
    static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(0, board, ans, n);
        return ans;
    }
    static void solve(int col,char[][] board,List<List<String>> ans,int n){
        if (col == n) {
            ans.add(construct(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                solve(col+1,board,ans,n);
                board[row][col]='.';
            }
        }
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
