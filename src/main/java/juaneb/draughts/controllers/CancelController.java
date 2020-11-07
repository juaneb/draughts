package juaneb.draughts.controllers;

import juaneb.draughts.models.Game;
import juaneb.draughts.models.State;

class CancelController extends Controller {

    protected CancelController(Game game, State state) {
        super(game, state);
    }

    public void cancel() {
		this.game.cancel();
		this.state.next();
	}

}