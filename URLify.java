public class URLify {
    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        int length = 13;
        String result = URLify(s, length);
        System.out.println(result);
    }

    // Write a method to replace all spaces in a string with '%20'
    public static String URLify(String s, int length) {
        char[] array = new char[s.length()];
        int index = 0;
        for (int i =0; i < length; i++) {
            if (s.charAt(i) != ' ') {
                array[index] = s.charAt(i);
                index++;
            }
            else {
                array[index] = '%';
                array[index+1] = '2';
                array[index+2] = '0';
                index += 3;
            }
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}
