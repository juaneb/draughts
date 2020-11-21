package usantatecla.draughts.models;

public interface ColorInterface {
    
    boolean isInitialRow(final int row);
    Color getInitialColor(final Coordinate coordinate);    
	
}