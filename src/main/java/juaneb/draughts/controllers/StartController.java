package juaneb.draughts.controllers;

import juaneb.draughts.models.Game;
import juaneb.draughts.models.State;

public class StartController extends InteractorController {

	public StartController(Game game, State state) {
        super(game, state);
	}

	public void start() {
        this.state.next();
	}
    
    @Override
	public void accept(InteractorControllersVisitor controllersVisitor) {
		assert controllersVisitor != null;
		controllersVisitor.visit(this);
    }

}
