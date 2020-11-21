package juaneb.views;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;


import juaneb.controllers.StartController;

public class StartViewTest {

    static final String TITTLE = "Draughts";

    @Mock
    private StartController startController;

    @Mock
    private GameView gameView;

    @InjectMocks
    private StartView startView;

    @Before
    public void before() {
        initMocks(this);        
    }

    @Test(expected = AssertionError.class)
    public void giveNullArgumentotoInteractThenSouldTrhowError(){
        startView.interact(null);
    }

    @Test
    public void testStartView() {        
        startView.interact(startController);
        verify(startController).start();        
    }

}


