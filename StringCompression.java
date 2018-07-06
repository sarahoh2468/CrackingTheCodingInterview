public class StringCompression {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        String result = compress(s);
        System.out.println(result);
    }
    /* Perform basic string compression using the counts of repeated characters. If the "compressed" string
    would not become smaller, your method should return the original string.
     */
    public static String compress(String s) {
        String result = "";
        int count = 1;
        char c;
        String string_count;
        for (int i = 0; i < s.length()-1; i++) {
            c = s.charAt(i);
            if (c == s.charAt(i+1)) {
                count++;
            }
            else {
                string_count = Integer.toString(count);
                result += c + string_count;
                count = 1;
            }
        }
        if (count != 1) {
            string_count = Integer.toString(count);
            c = s.charAt(s.length()-1);
            result += c + string_count;
        }
        if (result.length() >= s.length()) {
            return s;
        }
        return result;

    }
}
