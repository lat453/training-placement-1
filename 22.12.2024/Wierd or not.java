
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


---

Inputs and Outputs:

Input 1:

3

Output 1:

Weird


---

Input 2:

24

Output 2:

Not Weird


---

Input 3:

8

Output 3:

Not Weird


---

Input 4:

15

Output 4:

Weird

