import java.util.ArrayList;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;



public class Board {
    private ArrayList<Card> card;
    private Piece[] board;
    private int dayCounter;
    private ArrayList<Player> players;
    private int playerTurn;

    public Board(ArrayList<Player> players){}

    public static int rollDice(){
        return 1;
    }

    private void initalizeCards(){}

    private void dayEnded(){}

    private void initalizePieces(){}

    public void setDayCounter(int dayCounter) {
        this.dayCounter = dayCounter;
    }
    public int getDayCounter() {
        return dayCounter;
    }
    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }
    public void nextPlayerTurn(){
        this.playerTurn = (this.playerTurn + 1) % players.size();
    }
    public int getPlayerTurn() {
        return playerTurn;
    }

    public Piece findPiece(String pieceName){
        return new Piece();
    }

    public Piece[] getBoard() {
        return board;
    }
}
