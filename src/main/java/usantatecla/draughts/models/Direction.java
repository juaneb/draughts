package usantatecla.draughts.models;

enum Direction {
    NE(1, 1), SE(1, -1), SW(-1, -1), NW(-1, 1);

    private int horizontalShift;
    private int verticalShift;

    private Direction(int horizontalShift, int verticalShift) {
        this.horizontalShift = horizontalShift;
        this.verticalShift = verticalShift;
    }

    public boolean isOnDirection(Coordinate coordinate) {

        boolean isNotDiagonalMovement = Math.abs(coordinate.getRow()) != Math.abs(coordinate.getColumn());
        boolean isRowZero = coordinate.getRow() == 0;
        boolean isNotHorizontalShift = horizontalShift * coordinate.getRow() < 0;
        boolean isNotVerticalShift = verticalShift * coordinate.getColumn() < 0;

        if (isNotDiagonalMovement || isRowZero || isNotHorizontalShift || isNotVerticalShift) {
            return false;
        }
        return true;
    }

    Coordinate getDistanceCoordinate(int distance) {
        int row = this.horizontalShift * distance;
        int column = this.verticalShift * distance;
        return new Coordinate(row, column);
    }

}