public class Permutation {
    public static void main(String[] args) {
        //Test 1
        String s1 = "apple";
        String s2 = "paple";
        boolean result = isPermutation(s1, s2);
        System.out.println(result);
        //Test 2
        s2 = "pineapple";
        result = isPermutation(s1, s2);
        System.out.println(result);
        //Test 3
        s2 = "grape";
        result = isPermutation(s1, s2);
        System.out.println(result);
        //Test 4
        s2 = "appll";
        result = isPermutation(s1, s2);
        System.out.println(result);
    }

    // Given two strings, write a method to decide if one is a permutation of the other
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int l = s1.length();
        for (int i = 0; i < l; i++) {
            char c1 = s1.charAt(i);
            String c = "" + c1;
            if (!s2.contains(c)) {
                break;
            }
            if (i == l-1) {
                return true;
            }
            int index = s2.indexOf(c);
            s2 = s2.substring(0, index) + s2.substring(index+1);

        }
        return false;
    }
}
