package juaneb.views;

import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

import juaneb.controllers.StartController;
import juaneb.models.Game;
import juaneb.models.State;
import juaneb.models.StateValue;
import juaneb.utils.Console;

public class StartViewTest {

    static final String TITTLE = "Draughts";

    @Mock
    Console console;

    @InjectMocks
    StartView startView = new StartView();

    @Test
    public void testWellcomeText() {
        //¿realmente hay que probar algo en el startview?
    }

}


