package juaneb.models;

import juaneb.models.Coordinate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.core.Is;
import org.junit.Test;


public class GameBuilderTestLF {

    Game game;

    @Test
    public void testResetGame (){      
        
        Game gameReset = new GameBuilderLF(
            " n n n n",
            "n n n n ",
            " n n n n",
            "        ",
            "        ",
            "b b b b ",
            " b b b b",
            "b b b b ").build();            

        this.game = new GameBuilderLF(
        "        ",
        "        ",
        "        ",
        " n   n  ",
        "  n n   ",
        "   b    ",
        "        ",
        "        ").build();
        
        this.game.reset();

        assertEquals(this.game, gameReset);        
    }

    @Test
    public void testGivenBlockedPawnThenReturnTrue (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        " n   n ",
        "  n n  ",
        "   b   ",
        "       ",
        "       ").build();
        assertTrue(this.game.isBlocked());
    }

    @Test
    public void testGivenBlockedPawnByWallThenReturnTrue (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        "  n    ",
        " n     ",
        "b      ",
        "       ",
        "       ").build();
        assertTrue(this.game.isBlocked());
    }

    @Test
    public void testGivenBlockedPawnThenReturnFalse (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        " n     ",
        "  n n  ",
        "   b   ",
        "       ",
        "       ").build();
        assertFalse(this.game.isBlocked());
    }

    @Test
    public void testGivenmoveNotAdvanceError (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        "  n n  ",
        "       ",
        "  n n  ",
        "   b   ",
        "       ").build();

        Error error = this.game.move(coordinate(6,3),coordinate(4,5), coordinate(2,3), coordinate(4,1), coordinate(6,3));
        assertEquals(Error.NOT_ADVANCED,error);
    }

    @Test
    public void testGivenmoveEmptyOriginError (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        "  n n  ",
        "       ",
        "  n n  ",
        "   b   ",
        "       ").build();

        Error error = this.game.move(coordinate(7,3),coordinate(4,5));
        assertEquals(Error.EMPTY_ORIGIN,error);
    }

    @Test
    public void testGivenmoveNotEmptyTargerError (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        "  n n  ",
        "     n ",
        "  n n  ",
        "   b   ",
        "       ").build();

        Error error = this.game.move(coordinate(6,3),coordinate(4,5));
        assertEquals(Error.NOT_EMPTY_TARGET,error);
    }

    
    @Test
    public void testGivenmovegetOpositePieceError (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        "  n n  ",
        "     n ",
        "  n n  ",
        "   b   ",
        "       ").build();

        Error error = this.game.move(coordinate(3,2),coordinate(4,1));
        assertEquals(Error.OPPOSITE_PIECE,error);
    }



    @Test
    public void testGiven4moveToMuchJumpsError1 (){
        this.game = new GameBuilderLF(
        "       ",
        "       ",
        "       ",
        "  n n  ",
        "       ",
        "  n n  ",
        "   b   ",
        "       ").build();

        Game expectedGame = new GameBuilderLF(
            "       ",
            "       ",
            "       ",
            "  n n  ",
            "     b ",
            "  n    ",
            "       ",
            "       ").build();

       //expectedGame.move(coordinate())

        this.game.move(coordinate(6,3),coordinate(4,5));
        assertEquals(expectedGame, this.game);
    }



    private Coordinate coordinate(int row, int column){
        return new Coordinate(row, column);
    }

    
}
