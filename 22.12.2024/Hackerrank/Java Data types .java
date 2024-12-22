program: java datatypes

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
        
        scanner.close();
    }
}

Input:

42
3.14
Hello, World!

Output:

Integer: 42
Double: 3.14
String: Hello, World!



  
