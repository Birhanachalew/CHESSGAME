package am.aua.chess;

import am.aua.chess.cli.ChessConsole;
import am.aua.chess.ui.ChessUI;

public class Main {
    public static void main(String[] args) {
        // This program runs from the following location and the
        // accompanying database.txt file must be place there.
        //System.out.println(System.getProperty("user.dir"));
        if(args.length == 0)
            new ChessUI();
        else if (args.length == 1 && args[0].equals("-console")) {
            ChessConsole chessConsole = new ChessConsole();
             chessConsole.run();
        }


    }
}