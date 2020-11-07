package juaneb.draughts.controllers;

import juaneb.draughts.models.Coordinate;
import juaneb.draughts.models.Game;
import juaneb.draughts.models.Piece;
import juaneb.draughts.models.State;

public abstract class InteractorController extends Controller {

	protected InteractorController(Game game, State state) {
		super(game, state);
	}

	public Piece getPiece(Coordinate coordinate) {
		return this.game.getPiece(coordinate);
	}

	abstract public void accept(InteractorControllersVisitor controllersVisitor);

}
