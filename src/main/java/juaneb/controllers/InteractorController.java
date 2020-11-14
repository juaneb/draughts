package juaneb.controllers;

import juaneb.models.Coordinate;
import juaneb.models.Game;
import juaneb.models.Piece;
import juaneb.models.State;

public abstract class InteractorController extends Controller {

	protected InteractorController(Game game, State state) {
		super(game, state);
	}

	public Piece getPiece(Coordinate coordinate) {
		return this.game.getPiece(coordinate);
	}

	abstract public void accept(InteractorControllersVisitor controllersVisitor);

}
