package leetcode;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aabbccccdeef";
        System.out.println(compression2(str));
        System.out.println(compression1(str));

    }

    //    Time Complexity: O(n)
//    Space Complexity: O(n)
    public static String compression1(String str) {
        //char s = str.charAt(0);
        StringBuilder sb = new StringBuilder(str.substring(0, 1));

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr != prev) {
                sb.append(curr);
            }
        }
        return sb.toString();
    }

    //    Time Complexity: O(n)
//    Space Complexity: O(n)
    public static String compression2(String str) {
        //char s = str.charAt(0);
        StringBuilder s = new StringBuilder(str.substring(0, 1));
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                if (count > 1) {
                    s.append(count);
                    count = 1;
                }
                s.append(curr);
            }
        }
        //this is for last character
        if (count > 1) {
            s.append(count);
            count = 1;
        }
        return s.toString();
    }

}
