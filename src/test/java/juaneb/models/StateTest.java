package juaneb.models;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StateTest {

    private static List<StateValue> stateValues;
    State state;

    @BeforeClass
    public static void initialStates(){
        stateValues = new ArrayList<>();
        stateValues.add(StateValue.INITIAL);
        stateValues.add(StateValue.IN_GAME);
        stateValues.add(StateValue.FINAL);
        stateValues.add(StateValue.EXIT);        
    }

    @Before
    public void before(){
        this.state = new State();
    }

    @Test public void testInitialState(){
        for (int stateOrder = 0; stateOrder < stateValues.size() - 1; stateOrder++){
            assertEquals(this.state.getValueState(),stateValues.get(stateOrder));
            this.state.next();
        }

    }




    
}
