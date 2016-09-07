package com.naskogeorgiev.homework03092016.exercise1;

class TicTacToe {

    // Logic is taken from this link:
    // http://stackoverflow.com/questions/1056316/algorithm-for-determining-tic-tac-toe-game-over

    private int n;
    private State[][] board;

    TicTacToe(int size) {
        this.n = size;
        board = new State[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = State.Blank;
            }
        }
    }

    private int moveCount;


    boolean Move(int x, int y, State s) {
        if (board[x][y] == State.Blank) {
            board[x][y] = s;
        }
        moveCount++;

        //check end conditions

        //check col
        for (int i = 0; i < n; i++) {
            if (board[x][i] != s)
                break;
            if (i == n - 1) {
                //report win for s
                return true;
            }
        }

        //check row
        for (int i = 0; i < n; i++) {
            if (board[i][y] != s)
                break;
            if (i == n - 1) {
                //report win for s
                return true;
            }
        }

        //check diag
        if (x == y) {
            //we're on a diagonal
            for (int i = 0; i < n; i++) {
                if (board[i][i] != s)
                    break;
                if (i == n - 1) {
                    //report win for s
                    return true;
                }
            }
        }

        //check anti diag (thanks rampion)
        for (int i = 0; i < n; i++) {
            if (board[i][(n - 1) - i] != s)
                break;
            if (i == n - 1) {
                //report win for s
                return true;
            }
        }

        //check draw
        if (moveCount == (n ^ 2 - 1)) {
            //report draw
            return false;
        }
        return false;
    }
}
