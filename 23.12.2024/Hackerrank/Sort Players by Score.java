Program 4: Sort Players by Score


Program:

import java.util.*;

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score;
        } else {
            return a.name.compareTo(b.name);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(players, new Checker());
        for (Player player : players) {
            System.out.println(player.name + " " + player.score);
        }
    }
}

Input:

5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150

Output:

aleksa 150
amy 100
david 100
aakansha 75
heraldo 50
