package juaneb.controllers;

import juaneb.models.Coordinate;
import juaneb.models.Error;
import juaneb.models.Game;
import juaneb.models.State;

class MoveController extends Controller {

	private static final int MINIMUM_COORDINATES = 2;

    protected MoveController(Game game, State state) {
        super(game, state);
    }

    public Error move(Coordinate... coordinates) {
        assert coordinates.length >= MoveController.MINIMUM_COORDINATES;
		for(Coordinate coordinate: coordinates)
			assert coordinate != null;
		Error error = this.game.move(coordinates);
		if (this.game.isBlocked())
			this.state.next();
		return error;
	}

}