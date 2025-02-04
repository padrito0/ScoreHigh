public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("JD", 100);

        player1.displayPlayerInfo();

        player1.setInitials("AB");
        player1.setScore(150);

        player1.displayPlayerInfo();
    }
}
