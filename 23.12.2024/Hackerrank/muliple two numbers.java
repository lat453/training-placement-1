muliple two numbers
import java.util.Scanner;

public class MultiplyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int product = num1 * num2;

        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    }
}
Input:
Enter the first number: 5  
Enter the second number: 10



Output:The product of 5 and 10 is: 50
