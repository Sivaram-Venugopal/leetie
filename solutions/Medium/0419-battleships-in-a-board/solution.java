// ──────────────────────────────────────────────────
// Problem  : 419. Battleships in a Board
// Difficulty: Medium
// Tags     : Array, Depth-First Search, Matrix
// Link     : https://leetcode.com/problems/battleships-in-a-board/
// Runtime  : 1 ms (beats 99%)
// Memory   : 46864000 (beats 23%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class Solution {
    public int countBattleships(char[][] board) {
        int cnt=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='X'){
                    cnt++;
                    helper(i,j, board);
                }
            }
        }

        return cnt;
    }

    public void helper(int i, int j, char board[][]){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]=='.'){
            return;
        }

        board[i][j]='.';

        int dir[][] = {
            {1,0},{-1,0},{0,1},{0,-1}
        };

        for(int k=0;k<4;k++){
            helper(i+dir[k][0], j+dir[k][1], board);
        }
    }
}