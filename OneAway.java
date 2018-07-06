public class OneAway {
    public static void main(String[] args) {
        String s1 = "plate";
        String s2 = "plates";
        boolean result = isOneAway(s1, s2);
        System.out.println(result);
        s2 = "plat";
        result = isOneAway(s1, s2);
        System.out.println(result);
        s2 = "plete";
        result = isOneAway(s1, s2);
        System.out.println(result);
        s2 = "pleet";
        result = isOneAway(s1, s2);
        System.out.println(result);
        s2 = "blate";
        result = isOneAway(s1, s2);
        System.out.println(result);
    }
    /* There are three types of edits that can be performed on strings: insert, remove, or replace a character.
    Given two strings, write a function to check if they are one edit (or zero edits) away
    */
    public static boolean isOneAway(String s1, String s2) {
        int count = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
            return true;
        }
        String shorter; String longer;
        if (s1.length() == s2.length() + 1) {
            longer = s1;
            shorter = s2;
        }
        else if (s1.length() + 1 == s2.length()) {
            longer = s2;
            shorter = s1;
        }
        else {
            return false;
        }
        for (int i = 0; i < longer.length(); i++) {
            if (i == shorter.length()) {
                break;
            }
            if (shorter.charAt(i) != longer.charAt(i)) {
                count++;
                if (i == 0) {
                    shorter = longer.charAt(i) + shorter;
                }
                else if (i != shorter.length()){
                    shorter = shorter.substring(0, i + 1) + longer.charAt(i) + shorter.substring(i + 1);
                }
            }
        }
        if (count > 1) {
            return false;
        }
        return true;
    }
}
