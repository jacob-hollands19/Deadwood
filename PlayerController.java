public class PlayerController {
    private Player player;


    public PlayerController(Player player){
        this.player = player;
    }
    public int getRank() {
        return player.getRank();
    }
    
    public int getDollars() {
        return player.getDollars();
    }
    
    public int getCredits() {
        return player.getCredits();
    }
    
    public int getPracticeChips() {
        return player.getPracticeChips();
    }
}
