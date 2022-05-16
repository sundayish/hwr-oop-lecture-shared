package hwr.oop.exercises.gameoflife;

public class Position {
    private int column;
    private int row;

    public Position(int x, int y) {
        this.column = x;
        this.row = y;
    }

    public boolean isNextTo(Position neighbour) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (this.column == neighbour.column + i && this.row == neighbour.row + j)
                    return true;
            }
        }
        return false;
    }

}
