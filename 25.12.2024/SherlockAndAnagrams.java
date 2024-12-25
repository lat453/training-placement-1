import java.util.HashMap;

public class SherlockAndAnagrams {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(countAnagrams(s));
    }

    static int countAnagrams(String s) {
        HashMap<String, Integer> substrCount = new HashMap<>();
        int totalAnagrams = 0;

        // Generate all substrings and store their sorted form in the hashmap
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                char[] chars = substr.toCharArray();
                java.util.Arrays.sort(chars);
                String sortedSubstr = new String(chars);

                substrCount.put(sortedSubstr, substrCount.getOrDefault(sortedSubstr, 0) + 1);
            }
        }

        // Calculate the number of anagram pairs
        for (int count : substrCount.values()) {
            totalAnagrams += (count * (count - 1)) / 2; // Combination formula
        }

        return totalAnagrams;
    }
}
