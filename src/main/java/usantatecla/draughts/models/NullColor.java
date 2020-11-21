package usantatecla.draughts.models;

public class NullColor implements ColorInterface{    
    
    public boolean isInitialRow(final int row){
        return false;
    }

    public Color getInitialColor(final Coordinate coordinate) {        
        return null;
    }
	
}