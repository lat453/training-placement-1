Program 2: Reading lines until EOF and numbering them

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }
        scanner.close();
    }
}

Input:

Hello world
I am learning Java
EOF handling is cool!

Output:

1 Hello world
2 I am learning Java
3 EOF handling is cool
