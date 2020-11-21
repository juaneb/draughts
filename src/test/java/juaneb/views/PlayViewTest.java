package juaneb.views;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import juaneb.controllers.PlayController;
import juaneb.models.Game;
import juaneb.models.State;
import juaneb.models.Color;
import juaneb.utils.Console;

@RunWith(MockitoJUnitRunner.class)
public class PlayViewTest {

    private static final String COLOR_PARAM = "#color";
    private static final String[] COLOR_VALUES = { "blancas", "negras" };
    private static final String PROMPT = "Mueven las " + COLOR_PARAM + ": ";
    private static final String CANCEL_FORMAT = "-1";
    private static final String MOVEMENT_FORMAT = "[1-8]{2}(\\.[1-8]{2}){1,2}";
    private static final String ERROR_MESSAGE = "Error!!! Formato incorrecto";
    private static final String LOST_MESSAGE = "Derrota!!! No puedes mover tus fichas!!!";
    private String string;

    @Mock
    Console console;

    @Mock
    PlayController playController;

    @InjectMocks
    PlayView playView;


    @Before
    public void before() {       
            initMocks(this);
    }

    @Test (expected = AssertionError.class)
    public void testGivenInteractWithNullValueThenAssertionError() {
        playView.interact(null);
    }

    @Test
    public void testGivenCancelFormat() {

        Game game = new Game();
        State state = new State();
        state.next();

        PlayController playController = new PlayController(game, state);

        when(playController.getColor()).thenReturn(Color.WHITE);
        when(console.readString("Mueven las blancas: ")).thenReturn("-1");

        playView.interact(playController);
        verify(playController).cancel();
    }


     @Test
    public void testGivenBadFormat() {

        Game game = new Game();
        State state = new State();
        state.next();

        PlayController playController = new PlayController(game, state);

        when(console.readString("Mueven las blancas: ")).thenReturn("patata");
        this.playView.interact(playController);
        verify(console).writeln("Error!!! Formato incorrecto");

    }

    @Test
    public void testGivenGoodFormat() {
        Game game = new Game();
        State state = new State();
        state.next();

        PlayController playController = new PlayController(game, state);

        when(this.console.readString("Mueven las blancas: ")).thenReturn("61.52");
        this.playView.interact(playController);

        verify(console).writeln("Mueven las negras: ");

    }
  
}
