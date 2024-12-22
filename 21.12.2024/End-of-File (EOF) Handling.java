Program 9: End-of-File (EOF) Handling

Code (Without Comments):

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
I am a file
Read me until end-of-file.

Output:

1 Hello world
2 I am a file
3 Read me until end-of-file
