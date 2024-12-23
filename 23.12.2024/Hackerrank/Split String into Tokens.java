Program 1:  Split String into Tokens

Program:

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

Input:

He is a very very good boy, isn't he?

Output:

10
He
is
a
very
very
good
boy
isn
t
he
