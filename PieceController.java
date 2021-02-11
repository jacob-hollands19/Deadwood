import java.util.ArrayList;

public class PieceController {
    private Piece piece;

    public PieceController(Piece piece){
        this.piece = piece;
    }

    public ArrayList<Player> getPlayers() {
        return piece.getPlayers();
    }
    public int getMaxShots(){
        return piece.getMaxShots();
    }
    public int getShotCounter(){
        return piece.getShotCounter();
    }
    public ArrayList<String> getExtraInfo(int col){
        return piece.getExtraInfo(col);
    }

    public String[][] getShotArea(){
        return new String[1][1];
    }
}
