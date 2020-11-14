package juaneb.models;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameBuilderTest {

    Game game;

    @Test
    public void testGivenBlockedPawnThenReturnTrue (){
        this.game = new GameBuilder().rows(
        "        ",
        "        ",
        "        ",
        " n   n  ",
        "  n n   ",
        "   b    ",
        "        ",
        "        ").build();
        assertTrue(this.game.isBlocked());
    }
}
