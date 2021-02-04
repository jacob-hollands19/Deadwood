import java.util.ArrayList;

public class Card {
    private Player[] numRoles;
    private boolean isFlipped;
    private boolean isFinished;
    private String cardName;
    private String img;
    private String budget;
    private String sceneNum;
    private String sceneDesc;
    private ArrayList<ArrayList<String>> roleInfo;

    public Card(String name, String img, String budget, String sceneNum, String sceneDesc,  ArrayList<ArrayList<String>> roleInfo){}


    public void changeRolesUsed(Player player, int pos){}

    public Player[] getRolesUsed() {
        return numRoles;
    }
    public boolean isFlipped(){
        return isFlipped;
    }
    public boolean isFinished(){
        return isFinished;
    }
    public String getCardName() {
        return cardName;
    }
    public String getBudget() {
        return budget;
    }
    public String getImg() {
        return img;
    }
    public String getSceneNum() {
        return sceneNum;
    }
    public String getSceneDesc() {
        return sceneDesc;
    }
    public ArrayList<String> getRoleInfo(int col){
        return roleInfo.get(col);
    }
    public int getNumRoles(){
        return roleInfo.size();
    }
    public void finished() {
        isFinished = !isFinished;
    }
    public void flipped() {
        isFlipped = !isFlipped;
    }
    
}
