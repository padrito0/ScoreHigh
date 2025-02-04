public class Player {
    private String initials;
    private int score;
    
    public Player(String initials, int score) {
        this.initials = initials;
        this.score = score;
    }
    
    public String getInitials() {
        return initials;
    }
    
    public void setInitials(String initials) {
        this.initials = initials;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public void displayPlayerInfo() {
        System.out.println("Player; " + initials + ", Score: " + score);
    }
}