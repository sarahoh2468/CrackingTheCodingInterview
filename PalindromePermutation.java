public class PalindromePermutation {
    public static void main(String[] args) {
        String s = "Tact Coa";
        boolean result = isPalindromePermutation(s);
        System.out.println(result);
        s = "hannah";
        result = isPalindromePermutation(s);
        System.out.println(result);
        s = "aannah";
        result = isPalindromePermutation(s);
        System.out.println(result);
        s = "nahnah";
        result = isPalindromePermutation(s);
        System.out.println(result);
        s = "abzdefgabhdefg";
        result = isPalindromePermutation(s);
        System.out.println(result);
    }

    // Given a string, write a function to check if it is a permutation of a palindrome
    public static boolean isPalindromePermutation(String s) {
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        String c = "" + s.charAt(0);
        String copy = s.substring(1);
        int count = 0;
        while (copy.length() > 1) {
            if (copy.contains(c)) {
                int index = copy.indexOf(c);
                if (index == copy.length() -1) {
                    c = "" + copy.charAt(0);
                    copy = copy.substring(1, index);
                }
                else if (index == 0) {
                    if (copy.length() == 2) {
                        return true;
                    }
                    else{
                        c = "" + copy.charAt(1);
                        copy = copy.substring(2, copy.length());
                    }
                }
                else {
                    c = "" + copy.charAt(0);
                    copy = copy.substring(1, index) + copy.substring(index + 1);
                }
            }
            else {
                count++;
                if (count == 2) {
                    return false;
                }
                else {
                    c = "" + copy.charAt(0);
                    copy = copy.substring(1);
                }
            }
        }
        if (!c.equals(copy) && (s.length() % 2 == 0)) {
            return false;
        }
        return true;
    }
}