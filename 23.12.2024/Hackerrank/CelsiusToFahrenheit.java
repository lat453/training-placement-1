//CelsiusToFahrenheit//
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F.");
    }
}
Input:
Enter temperature in Celsius: 25



output:25.0°C is equal to 77.0°F.
