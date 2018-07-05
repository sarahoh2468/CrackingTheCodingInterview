public class Unique_Char {
    public static void main(String[] args) {
        String s = "Hello World";
        boolean result = IsUnique(s);
        System.out.println(result);
    }

    // Implement an algorithm to determine if a string has all unique characters. What if
    // you cannot use additional data structures?
    public static boolean IsUnique(String s) {
        char[] array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
