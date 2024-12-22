Program 1: Printing "Hello, World." and "Hello, Java."

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

Input:

No input required.

Output:

Hello, World.
Hello, Java.


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

Program 3: Multiples of a number

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
         System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}

Input:

2

Output:

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20



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



Program 5: Conditional output based on number properties

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}

Input:

3

Output:

Weird

Input:

24

Output:

Not Weird



Program 6: Determining primitive data types that can fit a number

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= -128 && n <= 127) System.out.println("* byte");
                if (n >= -32768 && n <= 32767) System.out.println("* short");
                if (n >= -2147483648 && n <= 2147483647) System.out.println("* int");
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

Input:

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Output:

-150 can be fitted in:
* byte
* short
* int
* long
150000 can be fitted in:
* short
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long


Program 7: Series generation using a, b, and n

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

Input:

2
0 2 10
5 3 5

Output:

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

Program 8: Printing the First N Multiples

Code (Without Comments):

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}

Input:

3

Output:

3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30


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

program 10:Calculate the Area of a Parallelogram Using Static Initialization Block"



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

Input/Output:

Input 1:

1
3

Output 1:

3

Input 2:

-1
2

Output 2:

java.lang.Exception: Breadth and height must be positive



