Program 4: Printing formatted strings and integers

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
        scanner.close();
    }
}

Input:

java 100
cpp 65
python 50

Output:

================================
java           100
cpp            065
python         050
================================
