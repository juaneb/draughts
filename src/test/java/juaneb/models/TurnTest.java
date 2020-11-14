package juaneb.models;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class TurnTest {

    private static Color initialColor = Color.WHITE;
    private Turn turn;

    @Before
    public void before(){
        this.turn = new Turn();
    }

    @Test
    public void testInitialColor(){
        assertEquals(initialColor, this.turn.getColor());        
    }

    @Test
    public void testgetOppositeColor(){          
        assertEquals(this.turn.getColor(), initialColor);          
        assertNotEquals(this.turn.getOppositeColor(), initialColor);  
    }

    @Test
    public void testChangeColor(){                  
        this.turn.change();
        
        assertNotEquals(this.turn.getColor(), initialColor);          
        
    }

}
