import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String line = in.nextLine();

            // Regular expression to match valid tags and their content
            Pattern pattern = Pattern.compile("<([^<>/]+)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2)); // Print the content between tags
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }

            testCases--;
        }

        in.close();
    }
}
