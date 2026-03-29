package recursion.Sequences;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {       //D-down L-left R-right U-up
    public static void main(String[] args) {
        int[][] board={
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };
        if(board[0][0]==1){
            System.out.println(maze(board));
        }
    }
    static List<String> maze(int[][] board){
        List<String> ans=new ArrayList<>();
        int[][] visited=new int[board.length][board[0].length];
        findPath(board,visited,0,0,"",ans);
        return ans;
    }
    static void findPath(int[][] board,int[][] visited,int row,int col,String temp,List<String> ans){
        if(row==board.length-1 && col==board[0].length-1){
            ans.add(temp);
            return;
        }
        if(row+1<board.length && visited[row+1][col]==0 && board[row+1][col]==1){
            visited[row][col]=1;
            findPath(board, visited, row+1, col, temp+'D', ans);
            visited[row][col]=0;
        }
        if(col-1>=0 && visited[row][col-1]==0 && board[row][col-1]==1){
            visited[row][col]=1;
            findPath(board, visited, row, col-1, temp+'L', ans);
            visited[row][col]=0;
        }
        if(col+1<board[0].length && visited[row][col+1]==0 && board[row][col+1]==1){
            visited[row][col]=1;
            findPath(board, visited, row, col+1, temp+'R', ans);
            visited[row][col]=0;
        }

        if(row-1>=0 && visited[row-1][col]==0 && board[row-1][col]==1){
            visited[row][col]=1;
            findPath(board, visited, row-1, col, temp+'U', ans);
            visited[row][col]=0;
        }
    }
}
