import java.util.*;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class PlayerComparator implements Comparator<Player> {
    public int compare(Player p1, Player p2) {
        if (p1.score == p2.score) {
            return p1.name.compareTo(p2.name);
        }
        return p2.score - p1.score;
    }
}

public class CustomSort {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Amy", 100));
        players.add(new Player("David", 100));
        players.add(new Player("Heraldo", 50));
        players.add(new Player("Aakansha", 75));

        players.sort(new PlayerComparator());
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}
