package juaneb.controllers;

import juaneb.models.Game;
import juaneb.models.State;

class CancelController extends Controller {

    protected CancelController(Game game, State state) {
        super(game, state);
    }

    public void cancel() {
		this.game.cancel();
		this.state.next();
	}

}