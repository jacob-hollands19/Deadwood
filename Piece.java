import java.util.ArrayList;

public class Piece {
    private ArrayList<Player> players;
    private Card card;
    private int shotCounter;
    private int maxShots;
    private ArrayList<ArrayList<String>> extrasInfo;

    public Piece(Card card, String[][] extrasInfo, int maxShots){}
    
    public void addPlayer(Player player){}

    public void removePlayer(Player player){}

    public void moveOntoCard(Player player){}
    
    public void cardComplete(){}

    public void shotSuccess(){
        shotCounter++;
        if(shotCounter >= maxShots){
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


}
