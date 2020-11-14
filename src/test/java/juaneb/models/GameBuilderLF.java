package juaneb.models;

public class GameBuilderLF {
	
	String[] rows;
    
    public GameBuilderLF(String... rows){	
		this.rows = rows;		
    }   

	private Color color(char character){
		switch (character){
			case 'b':
			case 'B':
				return Color.WHITE;

			case 'n':
			case 'N':
				return Color.BLACK;
			default:
				return null;
		}
	}

    public Game build(){	
		Board board = new Board();
		Game game = new Game(board);	

		assert rows.length == Coordinate.getDimension();
	
		for (int i = 0; i < rows.length; i++){
			String row = rows[i];
			for (int j = 0; j < row.length(); j++){
				Color color = color(row.charAt(j));
				if (color != null){
					Piece piece = new Pawn(color);
					if (Character.isUpperCase(row.charAt(j))){
						piece = new Draught(color);
					}
					board.put(new Coordinate(i, j), piece);
				}
			}
		}

		return game;
	}
	
}
