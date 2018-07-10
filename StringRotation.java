public class StringRotation {
    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean result = isRotation(s1, s2);
        System.out.println(result);
        s2 = "bottlewater";
        result = isRotation(s1, s2);
        System.out.println(result);
        s2 = "bodtlewater";
        result = isRotation(s1, s2);
        System.out.println(result);
    }
    /* Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings,
    write code to check if s2 is a rotation of s1 using only one call to isSubstring
     */
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String first = "" + s1.charAt(0);
        String last = "" + s1.charAt(s1.length()-1);
        String combo = last + first;
        String result;
        for (int i = 0; i < s1.length(); i++) {
            if ((s2.indexOf(first) == 0) && (s2.indexOf(last) == s1.length() -1)) {
                if (s1.isSubstring(s2)) {
                    return true;
                }
            }
            if (s2.contains(combo)) {
                int index = s2.indexOf(first);
                result = s2.substring(index);
                for (int j = 0; j < index; j++) {
                    result += "" + s2.charAt(j);
                }
                if (s1.isSubstring(result)) {
                    return true;
                }
            }
        }
        return false;
    }
}
