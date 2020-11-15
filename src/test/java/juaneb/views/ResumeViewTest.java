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
import juaneb.utils.YesNoDialog;

public class ResumeViewTest {

    private static final String MESSAGE = "¿Queréis jugar otra";

    @Mock
    YesNoDialog yesNoDialog;

    @InjectMocks
    ResumeView resumeView = new ResumeView();

    @Test
    public void testREsumeText() {        
    }

}


