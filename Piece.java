import java.util.ArrayList;

public class Piece {
    private ArrayList<Player> players;
    private Card card;
    private int shotCounter;
    private ArrayList<ArrayList<String>> extrasInfo;
    private String[] neighbors;
    private String[][] shotArea;

    public Piece(Card card, String[][] extrasInfo, String[][] shotArea, String[] neighbors){}
    
    public Piece(){}

    public void addPlayer(Player player){}

    public void removePlayer(Player player){}

    public void moveOntoCard(Player player){}
    
    public void cardComplete(){}

    public void shotSuccess(){
        shotCounter++;
        if(shotCounter >= getMaxShots()){
            cardComplete();
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
    public Card getCard() {
        return card;
    }

    public ArrayList<String> getExtraInfo(int col){
        return extrasInfo.get(col);
    }
    public int getNumExtras(){
        return extrasInfo.size();
    }
    public int getShotCounter() {
        return shotCounter;
    }
    public int getMaxShots() {
        return shotArea.length;
    }

    public String[] getNeighbors() {
        return neighbors;
    }
    public String[][] getShotArea() {
        return shotArea;
    }


}
