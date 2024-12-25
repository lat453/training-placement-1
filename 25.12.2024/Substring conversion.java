public class SubstringComparisons {
    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        System.out.println(findSmallestAndLargest(s, k));
    }

    static String findSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);
            if (substr.compareTo(smallest) < 0) smallest = substr;
            if (substr.compareTo(largest) > 0) largest = substr;
        }

        return smallest + "\n" + largest;
    }
}
 java substring comparison
