package hwr.oop.exercises.gameoflife;

public class Field {
    private Cell[][] cells;

    public Field(int i) {
        cells = new Cell[i][i];
    }

    public Cell getCellAt(Position position) {
        return cells[position.x][position.y];
    }
}
