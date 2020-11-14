package juaneb.views;

import juaneb.controllers.StartController;

class StartView extends SubView {

    private static final String TITTLE = "Draughts";

    StartView(){
        super();
    }

    void interact(StartController startController) {
        assert startController != null;
        this.console.writeln(StartView.TITTLE);
        new GameView().write(startController);
        startController.start();
    }

}
