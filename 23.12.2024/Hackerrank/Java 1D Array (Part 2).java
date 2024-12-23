Program: Java 1D Array (Part 2)

import java.util.Scanner;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return isSolvable(leap, game, 0);
    }

    private static boolean isSolvable(int leap, int[] game, int i) {
        if (i >= game.length) return true;
        if (i < 0 || game[i] == 1) return false;

        game[i] = 1; // Mark as visited

        return isSolvable(leap, game, i + leap) || 
               isSolvable(leap, game, i + 1) || 
               isSolvable(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        scan.close();
    }
}
Input:
4
5 3
0 0 0 0 0
6 5
0 0 0 1 1 1
6 3
0 0 1 1 1 0
3 1
0 1 0



output:
YES
YES
NO
NO
