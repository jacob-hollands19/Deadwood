public class Player {
    private String name;
    private int rank;
    private int dollars;
    private int credits;
    private int practiceChips;
    private Boolean onCard;
    private int[] playerPos;

    public Player(String name){}

    public int tallyScore(){
        return 1;
    }
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getDollars() {
        return dollars;
    }
    public void setDollars(int dollars) {
        this.dollars = dollars;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
    public int getPracticeChips() {
        return practiceChips;
    }
    public void setPracticeChips(int practiceChips) {
        this.practiceChips = practiceChips;
    }
    public void setOnCard(Boolean onCard) {
        this.onCard = onCard;
    }
    public Boolean getOnCard() {
        return onCard;
    }
    public int[] getPlayerPos() {
        return playerPos;
    }
    public void setPlayerPos(int[] playerPos) {
        this.playerPos = playerPos;
    }

}
