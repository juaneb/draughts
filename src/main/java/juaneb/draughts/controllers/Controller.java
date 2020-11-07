package juaneb.draughts.controllers;

import juaneb.draughts.models.Color;
import juaneb.draughts.models.Coordinate;
import juaneb.draughts.models.Game;
import juaneb.draughts.models.State;

class Controller {

    protected Game game;
    protected State state;

    protected Controller(Game game, State state) {
        assert game != null;
        assert state != null;
        this.game = game;
        this.state = state;
    }

    public Color getColor(Coordinate coordinate) {
        assert coordinate != null;
        return this.game.getColor(coordinate);
    }

    public int getDimension() {
        return this.game.getDimension();
    }

}
