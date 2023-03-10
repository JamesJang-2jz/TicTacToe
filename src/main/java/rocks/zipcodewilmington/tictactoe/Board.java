package rocks.zipcodewilmington.tictactoe;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    public Character[][] board;
    public Board(Character[][] board) {
        this.board = board;
        System.out.println(Arrays.deepToString(this.board));
    }

    public Boolean isInFavorOfX() {
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
