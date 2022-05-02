package hwr.oop.exercises.gameoflife;

public class Cell {
    public Cell() {

    }
    boolean isAlive;
    public void markAlive() {
        isAlive = true;
    }

    public boolean isAliveNextGeneration() {
        return false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public Cell[] getNeighbours() {
        return new Cell[0];
    }

    public Position getPosition() {
        return null;
    }

    public boolean isDead() {
        return !isAlive;
    }
}
