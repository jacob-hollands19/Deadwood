import java.util.ArrayList;

public class CardController {
    private Card card;
    
    public CardController(Card card){
        this.card = card;
    }

    public Player[] getRolesUsed() {
        return card.getRolesUsed();
    }
    public boolean isFlipped(){
        return card.isFlipped();
    }
    public boolean isFinished(){
        return card.isFinished();
    }
    public String getCardName() {
        return card.getCardName();
    }
    public String getBudget() {
        return card.getBudget();
    }
    public String getImg() {
        return card.getImg();
    }
    public String getSceneNum() {
        return card.getSceneNum();
    }
    public String getSceneDesc() {
        return card.getSceneDesc();
    }
    public ArrayList<String> getRoleInfo(int col){
        return card.getRoleInfo(col);
    }
    public int getNumRoles(){
        return card.getNumRoles();
    }


}
