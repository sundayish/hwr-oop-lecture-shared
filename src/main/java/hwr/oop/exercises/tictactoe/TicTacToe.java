package hwr.oop.exercises.tictactoe;

import java.util.Arrays;

class TicTacToe {

    static int[][] board;
    public boolean circleSet;
    public boolean crossSet;

    int pointA;
    int pointB;

    TicTacToe() {
        board = new int[3][3];
        pointA = 0;
        pointB = 0;
    }

    int getValueAt(int x, int y) {
        return board[x][y];
    }

    void setCross(int x, int y) {
        if (!isGameOver() && getValueAt(x, y) == 0 && !crossSet) {
            board[x][y] = 1;
            crossSet = true;
            circleSet = false;
        } else
            throw new RuntimeException("You made an illegal move!");
    }

    void setCircle(int x, int y) {
        if (!isGameOver() && getValueAt(x, y) == 0 && !circleSet) {
            board[x][y] = 2;
            crossSet = false;
            circleSet = true;
        } else
            throw new RuntimeException("You made an illegal move!");
    }

    boolean isGameOver() {

        // vertical, horizontal wins
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1]) && (board[i][0] == board[i][2]))
                sum = board[i][0] + board[i][1] + board[i][2];
            else if ((board[0][i] == board[1][i]) && (board[0][i] == board[2][i]))
                sum1 = board[0][i] + board[1][i] + board[2][i];

            if ((sum == 3) || (sum1 == 3)) {
                pointA ++;
                System.out.println("Player A won and now has " + pointA + " point(s). Player B has " + pointB + " point(s).");
                return true;
            }
            else if ((sum == 6) || (sum1 == 6))  {
                pointB ++;
                System.out.println("Player B won and now has " + pointB + " point(s). Player A has " + pointA + " point(s).");
                return  true;
            }
        }

        // diagonal wins
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2])
            sum  = board[0][0] + board[1][1] + board[2][2];
        else if (board[0][2] == board[1][1] && board[0][2] == board[2][0])
            sum1 = board[0][2] + board[1][1] + board[2][0];

        if ((sum == 3) || (sum1 == 3))
            return true;
        else return (sum == 6) || (sum1 == 6);
    }

    public void clearBoard() {
        for (int[] ints : board) {
            Arrays.fill(ints, 0);
        }
    }

}
