Program: Java SHA-256

import java.util.*;
import java.security.MessageDigest;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(input.getBytes("UTF-8"));

        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        System.out.println(hexString.toString());
    }
}
Input:
HelloWorld


Output:872e4bdc3e6c3f879b97f3c3925c743d86d2d2f1fa81094c97398d49b2088b67
